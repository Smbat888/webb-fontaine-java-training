package chess.engine.board;

import chess.Piece;

/**
 * Created by: Hmayak Atayan on 12 December, 2019
 */
public class OccupiedTile extends Tile {

    private Piece pieceOnTile;

    OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
        super(tileCoordinate);
        this.pieceOnTile = pieceOnTile;
    }

    @Override
    public boolean isTileOccupied() {
        return true;
    }

    @Override
    public Piece getPiece() {
        return this.pieceOnTile;
    }
}

