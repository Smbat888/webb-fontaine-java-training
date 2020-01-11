package Week5.Chess;

public final class Rook extends Piece implements Movable{

    Rook(Color color, int curX, int curY) {
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
        return  ((endTile.isEmpty() || (!(endTile.isEmpty()) &&
                !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor()))))&&
                        (endTile.getY() == startTile.getY() || endTile.getX() == startTile.getX()) &&
                        (isXRowEmpty(startTile, endTile) || isYRowEmpty(startTile, endTile)));
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
            System.out.println("The piece can't move");
        }
    }
    @Override
    protected String print() {
        String message;
        if (color ==Color.BLACK){
            message = "♖";
        }else{
            message = "♜";
        }
        return message;
    }

}

