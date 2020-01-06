
package Figures;

import Chess.Position;
import Chess.GameSetup;

public class Queen extends Figure {

    public Queen(String owner, Position initialLocation, GameSetup game) {
        super(owner, initialLocation, game);
        if (owner.equalsIgnoreCase("player1")) {
            id = 'Q';
        } else if (owner.equalsIgnoreCase("player2")) {
            id = 'q';
        }
    }

    @Override
    public boolean moveTo(Position location) {
        return checkLineOfSight(position, location) && super.moveTo(location);
    }

    @Override
    protected void updateThreateningLocation() {
        threateningLocations.clear();

        super.updateVertical(1);
        super.updateVertical(-1);

        super.updateHorizontal(1);
        super.updateHorizontal(-1);

        super.updateDiagonal(1, 1);
        super.updateDiagonal(-1, 1);
        super.updateDiagonal(1, -1);
        super.updateDiagonal(-1, -1);
    }
}
