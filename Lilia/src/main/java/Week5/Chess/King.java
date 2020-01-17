package Week5.Chess;

public class King extends Piece {
    King(Color color, int curX, int curY) {
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
                !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor())))) &&
                (validateVerticalMove(startTile, endTile) || validateHorizontalMove(startTile, endTile) ||
                validateDiagonalMove(startTile, endTile))) ;
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
    String print() {
        String message;
        if (color == Color.BLACK) {
            message = "♔";
        } else {
            message = "♚";
        }
        return message;
    }

    private boolean validateHorizontalMove(Tile tile1, Tile tile2) {
        return (tile2.getX() + 1 == tile1.getX() || tile2.getX() - 1 == tile1.getX());
    }

    private boolean validateVerticalMove(Tile tile1, Tile tile2) {
        return (tile2.getY() + 1 == tile1.getY() || tile2.getY() - 1 == tile1.getY());
    }

    private boolean validateDiagonalMove(Tile tile1, Tile tile2) {
        return ((tile2.getX() + 1 == tile1.getX() && tile2.getY() + 1 == tile1.getY()) ||
                (tile2.getX() - 1 == tile1.getX() && tile2.getY() + 1 == tile1.getY()) ||
                (tile2.getX() - 1 == tile1.getX() && tile2.getY() - 1 == tile1.getY()) ||
                (tile2.getX() + 1 == tile1.getX() && tile2.getY() - 1 == tile1.getY()));
    }

}
