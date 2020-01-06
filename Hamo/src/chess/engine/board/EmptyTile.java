package chess.engine.board;

import chess.Piece;

/**
 * Created by: Hmayak Atayan on 12 December, 2019
 */
public class EmptyTile extends Tile {

    EmptyTile(int coordinate) {
        super(coordinate);
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}
