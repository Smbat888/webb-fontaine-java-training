package Week5.Chess;

public class Bishop extends Piece implements Movable {

    Bishop(Color color, int curX, int curY) {
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
        boolean validateEndTile = (endTile.isEmpty() || (!(endTile.isEmpty()) &&
                !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor())))) &&
                Math.abs(endTile.getX() - startTile.getX()) == Math.abs(endTile.getY() - startTile.getY());

        if (validateEndTile) {
            if (startTile.getX() < endTile.getX() && startTile.getY() < endTile.getY()) {
                return isUpperRightRowEmpty(startTile, endTile);
            }
            if (startTile.getX() < endTile.getX() && startTile.getY() > endTile.getY()) {
                return isLowerRightRowEmpty(startTile, endTile);
            }
            if (startTile.getX() > endTile.getX() && startTile.getY() < endTile.getY()) {
                return isUpperLeftRowEmpty(startTile, endTile);
            }
            if (startTile.getX() > endTile.getX() && startTile.getY() > endTile.getY()) {
                return isLowerLeftRowEmpty(startTile, endTile);
            }
        }

        return false;
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

    @Override
    protected String print() {
        String message;
        if (color == Color.BLACK) {
            message = "♗";
        } else {
            message = "♝";
        }
        return message;
    }
}
