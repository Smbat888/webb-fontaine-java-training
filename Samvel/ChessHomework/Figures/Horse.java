
package Figures;

import Chess.Position;
import Chess.GameSetup;
import Chess.Board;

public class Horse extends Figure {

    public Horse(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'H';
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'h';
        }
    }

    @Override
    public boolean moveTo(Position location) {
        if (Math.abs(position.getRow() - location.getRow()) == 2 &&
                Math.abs(position.getCol() - location.getCol()) == 1) {

            return super.moveTo(location);
        } else if (Math.abs(position.getRow() - location.getRow()) == 1 &&
                Math.abs(position.getCol() - location.getCol()) == 2) {

            return super.moveTo(location);
        }
        return false;
    }

    @Override
    protected void updateThreateningLocation() {
        int[] rowMoves = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int[] colMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

        threateningLocations.clear();
        for (int i = 0; i < 8; i++) {
            Position location = new Position(rowMoves[i], colMoves[i]);
            if (Board.locationInBounds(location)) {
                Figure piece = gameSetup.getBoard().getFigureAt(location);

                if (piece != null &&
                        !piece.getOwner().equals(owner)) {

                    threateningLocations.add(location);
                }
            }
        }
    }
}
