package classwork.oop.abstracts;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Circle extends Shape {
    private double radius;

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return String.format("circle:{color: %s, area: %f,perimeter: %f}", getColor(), getArea(), getPerimeter());
    }

}
