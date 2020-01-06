package classwork.oop.abstracts;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square(double side, String color) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("square :{color: %s, area: %f,perimeter: %f}", getColor(), getArea(), getPerimeter());
    }

}
