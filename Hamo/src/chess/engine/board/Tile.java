package chess.engine.board;

import chess.Piece;

/**
 * Created by: Hmayak Atayan on 12 December, 2019
 */
public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();


}
