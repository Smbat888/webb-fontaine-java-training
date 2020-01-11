package Week5.Chess;

public abstract class Piece {
    protected Color color;
    protected int curX;
    protected int curY;

    Piece() {
    }

    Piece(Color color, int curX, int curY) {
        this.color = color;
        this.curX = curX;
        this.curY = curY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurX() {
        return curX;
    }

    void setCurX(int curX) {
        this.curX = curX;
    }

    public int getCurY() {
        return curY;
    }

    void setCurY(int curY) {
        this.curY = curY;
    }
    abstract boolean canMove(Tile startTile, Tile endTile);
    abstract void move(Tile tile1, Tile tile2);
    abstract String print();


}
