package Week5.Chess;

public final class Rook extends Piece {

    public Rook(){
    }
    public Rook(Color color,int x,int y){
        super(x,y);
        this.color=color;
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
    boolean canMove(Tile tile) {
        return (tile.isEmpty());
    }

    @Override
    void move(int step) {
        setY(getY()+step);
    }

}

