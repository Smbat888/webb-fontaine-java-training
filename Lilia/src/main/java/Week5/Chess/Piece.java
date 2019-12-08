package Week5.Chess;

public abstract class Piece {
    protected Color color;
    protected int x;
    protected int y;

    public Piece() {
    }

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Piece(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
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

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract boolean canMove(Tile tile);

    abstract void move(int step);

}
