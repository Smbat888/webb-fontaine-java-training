
package Figures;

import Chess.Board;
import Chess.GameSetup;
import Chess.Position;

public class King extends Figure {

    public King(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'K';
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'k';
        }
    }

    @Override
    public boolean moveTo(Position location) {
        if (Math.abs(position.getRow() - location.getRow()) <= 1 &&
                Math.abs(position.getCol() - location.getCol()) <= 1) {

            return checkLineOfSight(position, location) && super.moveTo(location);
        }
        return false;
    }

    @Override
    protected void updateThreateningLocation() {
        threateningLocations.clear();
    }

    public Figure check() {
        Board board = gameSetup.getBoard();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Figure piece = board.getFigureAt(new Position(row, col));
                if (piece != null &&
                        !piece.getOwner().equals(owner)) {

                    piece.updateThreateningLocation();
                    for (Position l: piece.getThreateningLocations()) {
                        if (position.equals(l)) {
                            return piece;
                        }
                    }
                }
            }
        }
        return null;
    }
}
