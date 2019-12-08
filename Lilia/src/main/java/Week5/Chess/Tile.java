package Week5.Chess;

public class Tile {
    protected boolean empty;
    protected Piece piece;

    public Tile(){
    }

    public Tile (boolean empty){
    }

    public Tile (boolean empty,Piece piece){
        this.empty=empty;
        this.piece=piece;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty(){
        return true;
    }

}
