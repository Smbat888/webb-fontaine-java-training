package Chess;

public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position location = (Position) obj;
            return (row == location.getRow() &&
                    col == location.getCol());
        }
        return false;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}