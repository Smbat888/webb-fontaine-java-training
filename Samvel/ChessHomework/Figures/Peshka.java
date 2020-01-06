package Figures;

import Chess.Position;
import Chess.GameSetup;

public class Peshka extends Figure {

    private boolean firstMove;
    private int one;

    public Peshka(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'P';
            one = 1;
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'p';
            one = -1;
        }
        firstMove = true;
    }

    @Override
    public boolean moveTo(Position location) {
        if (location.getCol() == position.getCol()) {
            if (location.getRow() - position.getRow() == one) {
                if (firstMove) {
                    firstMove = false;
                }
                return !gameSetup.getBoard().isPieceAt(location.getRow(), location.getCol()) && super.moveTo(location);
            } else if (firstMove && (location.getRow() - position.getRow() == (one * 2))) {
                if (firstMove) {
                    firstMove = false;
                }
                return !gameSetup.getBoard().isPieceAt(location.getRow(), location.getCol()) && super.moveTo(location);
            }
        } else if (Math.abs(location.getCol() - position.getCol()) == 1) {
            if (gameSetup.getBoard().isPieceAt(location.getRow(), location.getCol()) &&
                    location.getRow() - position.getRow() == one) {

                if (firstMove) {
                    firstMove = false;
                }
                return super.moveTo(location);
            }
        }
        return false;
    }

    @Override
    protected void updateThreateningLocation() {
        int one = 0;
        if (owner.equalsIgnoreCase("player1") &&
                position.getRow() <= 6) {
            one = 1;
        } else if (owner.equalsIgnoreCase("player2") &&
                position.getRow() >= 1) {
            one = -1;
        }

        threateningLocations.clear();

        if (position.getCol() >= 1) {
            threateningLocations.add(new Position(position.getRow() + one, position.getCol() - 1));
        }
        if (position.getCol() <= 6) {
            threateningLocations.add(new Position(position.getRow() + one, position.getCol() + 1));
        }
    }
}