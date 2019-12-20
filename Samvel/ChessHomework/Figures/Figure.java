package Figures;

import Chess.GameSetup;
import Chess.Position;
import Chess.Board;
import java.util.ArrayList;

public abstract class Figure implements FigureInterface {

    GameSetup gameSetup;
    String owner;
    Position position;
    char id;
    ArrayList<Position> threateningLocations;

    protected abstract void updateThreateningLocation();

    public Figure(String owner, Position initialLocation, GameSetup game) {
        this.owner = owner;
        position = null;
        gameSetup = game;
        threateningLocations = new ArrayList<>();
        gameSetup.getBoard().placePieceAt(this, initialLocation);
    }

    boolean checkLineOfSight(Position start, Position end) {

        if (start.getCol() == end.getCol()) {
            int one = (start.getRow() - end.getRow() < 0) ? 1: -1;
            for (int row = start.getRow() + one; row < end.getRow(); row += one) {
                if (gameSetup.getBoard().isPieceAt(row, start.getCol())) {
                    return false;
                }
            }
            return true;
        }

        if (start.getRow() == end.getRow()) {
            int one = (start.getCol() - end.getCol() < 0) ? 1: -1;
            for (int col = start.getCol() + one; col < end.getCol(); col += one) {
                if (gameSetup.getBoard().isPieceAt(start.getRow(), col)) {
                    return false;
                }
            }
            return true;
        }

        if (start.getCol() - end.getCol() ==
                start.getRow() - end.getRow()) {

            int one = (start.getRow() - end.getRow() < 0) ? 1: -1;
            for (int inc = one; Math.abs(inc) < Math.abs(start.getRow() - end.getRow()); inc += one) {
                if (gameSetup.getBoard().isPieceAt(start.getRow() + inc, start.getCol() + inc)) {
                    return false;
                }
            }
            return true;
        } else if (start.getCol() - end.getCol() * -1 ==
                start.getRow() - end.getCol()) {

            int one = (start.getRow() - end.getRow() < 0) ? 1: -1;
            int negOne = one * -1;
            for (int inc = one; Math.abs(inc) < Math.abs(start.getRow() - end.getRow()); inc += one) {
                if (gameSetup.getBoard().isPieceAt(start.getRow() + inc, start.getCol() + (inc * negOne))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    void updateVertical(int one) {
        Position location = new Position(position.getRow() + one, position.getCol());
        while (Board.locationInBounds(location)) {
            Figure piece = gameSetup.getBoard().getFigureAt(location);
            if (piece != null) {
                if (!piece.getOwner().equalsIgnoreCase(owner)) {
                    threateningLocations.add(location);
                    return;
                } else if (!position.equals(location)) {
                    threateningLocations.add(new Position(location.getRow() - one, location.getCol()));
                    return;
                }
            } else {
                location = new Position(location.getRow() + one, location.getCol());
            }
        }
    }

    void updateHorizontal(int one) {
        Position location = new Position(position.getRow(), position.getCol() + one);
        while (Board.locationInBounds(location)) {
            Figure piece = gameSetup.getBoard().getFigureAt(location);
            if (piece != null) {
                if (!piece.getOwner().equalsIgnoreCase(owner)) {
                    threateningLocations.add(location);
                    return;
                } else if (!position.equals(location)) {
                    threateningLocations.add(new Position(location.getRow(), location.getCol() - one));
                    return;
                }
            } else {
                location = new Position(location.getRow(), location.getCol() + one);
            }
        }
    }

    void updateDiagonal(int rowOne, int colOne) {
        Position location = new Position(position.getRow() + rowOne, position.getCol() + colOne);
        while (Board.locationInBounds(location)) {
            Figure piece = gameSetup.getBoard().getFigureAt(location);
            if (piece != null) {
                if (!piece.getOwner().equalsIgnoreCase(owner)) {
                    threateningLocations.add(location);
                    return;
                } else if (!position.equals(location)) {
                    threateningLocations.add(new Position(location.getRow() - rowOne, location.getCol() - colOne));
                    return;
                }
            } else {
                location = new Position(location.getRow() + rowOne, location.getCol() + colOne);
            }
        }
    }

    public boolean moveTo(Position newLocation) {
        Board board = gameSetup.getBoard();
        Figure oldPiece = board.getFigureAt(newLocation);

        if (oldPiece == null ||
                !oldPiece.getOwner().equals(owner)) {

            board.placePieceAt(this, newLocation);
            return true;
        }
        return false;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position location) {
        position = location;
    }

    public String getOwner() {
        return owner;
    }

    public char getId() {
        return id;
    }

    ArrayList<Position> getThreateningLocations() {
        return threateningLocations;
    }
}