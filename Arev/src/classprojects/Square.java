package classprojects;

public class Square extends Rectangle{
    private double side;

    public Square(){

    }

    public Square(double side){
        super(side,side);
        this.side = side;

    }

    public Square(double side, String color){
        super(side,side,color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("square: {color: %s, area: %f, perimeter: %f}",
                getColor(), getArea(), getPerimeter());
    }
}
