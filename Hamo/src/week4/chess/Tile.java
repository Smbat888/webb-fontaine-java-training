package week4.chess;

/**
 * Created by: Hmayak Atayan on 01 December, 2019
 */
public abstract class Tile {
    private int TileCoordinate;

    public Tile(int tileCoordinate) {
        TileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();
}
