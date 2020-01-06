
package Figures;

import Chess.Position;
import Chess.GameSetup;

public class Rook extends Figure {

    public Rook(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'R';
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'r';
        }
    }

    @Override
    public boolean moveTo(Position location) {
        if ((position.getRow() == location.getRow()) !=
                (position.getCol() == location.getCol())) {

            return checkLineOfSight(position, location) && super.moveTo(location);
        }
        return false;
    }

    @Override
    protected void updateThreateningLocation() {
        threateningLocations.clear();

        super.updateVertical(1);
        super.updateVertical(-1);
        super.updateHorizontal(1);
        super.updateHorizontal(-1);
    }
}
