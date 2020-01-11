package Week5.Chess;

public final class Knight extends Piece {

    Knight(Color color, int curX, int curY) {
        super(color, curX, curY);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    boolean canMove(Tile startTile, Tile endTile) {
        return ((endTile.isEmpty() || (!(endTile.isEmpty()) &&
                !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor()))))
                && (validateUpperTiles(startTile, endTile) || validateLowerTiles(startTile, endTile)));
        }

    @Override
    void move(Tile tile1, Tile tile2) {
        if (canMove(tile1, tile2)) {
            tile2.setEmpty(false);
            tile2.setPiece(tile1.getPiece());
            tile1.getPiece().setCurX(tile2.getX());
            tile1.getPiece().setCurY(tile2.getY());
            tile1.setEmpty(true);
            tile1.setPiece(null);
        } else {
            System.out.println();
            System.out.println("The piece can't move");
        }
    }

    private boolean validateUpperTiles(Tile startTile, Tile endTile) {
        return ((endTile.getY() - 2 == startTile.getY() &&
                (endTile.getX() - 1 == startTile.getX() || endTile.getX() + 1 == startTile.getX())) ||
                (endTile.getY() - 1 == startTile.getY() &&
                        (endTile.getX() - 2 == startTile.getX() || endTile.getX() + 2 == startTile.getX())));
    }

    private boolean validateLowerTiles(Tile startTile, Tile endTile) {
        return ((endTile.getY() + 2 == startTile.getY() &&
                (endTile.getX() - 1 == startTile.getX() || endTile.getX() + 1 == startTile.getX())) ||
                (endTile.getY() + 1 == startTile.getY() &&
                        (endTile.getX() - 2 == startTile.getX() || endTile.getX() + 2 == startTile.getX())));
    }

    @Override
    protected String print() {
        String message;
        if (color ==Color.BLACK){
            message = "♘";
        }else{
            message = "♞";
        }
        return message;
    }
}


