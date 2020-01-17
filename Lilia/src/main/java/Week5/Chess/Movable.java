package Week5.Chess;

public interface Movable {
    default boolean isYRowEmpty(Tile tile1, Tile tile2) {
        for (int i = tile1.getY() + 1; i < tile2.getY(); i++) {
            if (!Board.tiles[tile1.getX()][i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    default boolean isXRowEmpty(Tile tile1, Tile tile2) {
        for (int i = tile1.getX() + 1; i < tile2.getX(); i++) {
            if (!Board.tiles[i][tile1.getY()].isEmpty()) {
                return false;
            }
        }
        return true;
    }
    default boolean isUpperRightRowEmpty(Tile tile1, Tile tile2) {
        int curX = tile1.getX();
        int curY = tile1.getY();
        int k = curX - tile2.getX();
        for (int i = 1; i < k; i++) {
            if (!(Board.tiles[curX + i][curY + i].isEmpty())) {
                return false;
            }
        }
        return true;
    }

    default boolean isUpperLeftRowEmpty(Tile tile1, Tile tile2) {
        int curX = tile1.getX();
        int curY = tile1.getY();
        int k = curX - tile2.getX();
        for (int i = 1; i < k; i++) {
            if (!(Board.tiles[curX - i][curY + i].isEmpty())) {
                return false;
            }
        }
        return true;
    }

    default boolean isLowerLeftRowEmpty(Tile tile1, Tile tile2) {
        int curX = tile1.getX();
        int curY = tile1.getY();
        int k = curX - tile2.getX();
        for (int i = 1; i < k; i++) {
            if (!(Board.tiles[curX - i][curY - i].isEmpty())) {
                return false;
            }
        }

        return true;
    }

    default boolean isLowerRightRowEmpty(Tile tile1, Tile tile2) {
        int curX = tile1.getX();
        int curY = tile1.getY();
        int k = Math.abs(curX - tile2.getX());
        for (int i = 1; i < k; i++) {
            if (!(Board.tiles[curX + i][curY - i].isEmpty())) {
                return false;
            }
        }

        return true;
    }
}
