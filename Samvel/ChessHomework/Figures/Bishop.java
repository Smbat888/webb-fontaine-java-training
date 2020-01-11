
package Figures;

import Chess.Position;
import Chess.GameSetup;

public class Bishop extends Figure {

    public Bishop(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'B';
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'b';
        }
    }

    @Override
    public boolean moveTo(Position location) {
        if (Math.abs(position.getRow() - location.getRow()) ==
                Math.abs(position.getCol() - location.getCol())) {

            return checkLineOfSight(position, location) && super.moveTo(location);
        }
        return false;
    }

    @Override
    protected void updateThreateningLocation() {
        threateningLocations.clear();
        super.updateDiagonal(1, 1);
        super.updateDiagonal(-1, 1);
        super.updateDiagonal(1, -1);
        super.updateDiagonal(-1, -1);
    }
}
