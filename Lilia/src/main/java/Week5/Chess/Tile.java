package Week5.Chess;

public class Tile {
    protected boolean empty;
    protected Piece piece;
    protected int x;
    protected int y;

    public Tile() {
    }

    private Tile(int x, int y) {
        this.y = y;
        this.x = x;
    }

    Tile(boolean empty, int x, int y) {
        this(x,y);
        this.empty = empty;
    }


    Tile(boolean empty, Piece piece, int x, int y) {
        this(x,y);
        this.empty = empty;
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY1(int y) {
        this.y = y;
    }

    void setEmpty(boolean empty) {
        this.empty = empty;
    }

    Piece getPiece() {
        return piece;
    }

    void setPiece(Piece piece) {
        this.piece = piece;
    }

    boolean isEmpty() {
        return (empty);
    }


}
