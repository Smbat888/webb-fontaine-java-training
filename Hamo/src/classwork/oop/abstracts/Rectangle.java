package classwork.oop.abstracts;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Rectangle extends Shape {
    private double width, length;

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        init(length, width);
    }

    public Rectangle(double length, double width) {
        init(length, width);
    }

    private void init(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("rectangle :{color: %s, area: %f,perimeter: %f}", getColor(), getArea(), getPerimeter());
    }
}
