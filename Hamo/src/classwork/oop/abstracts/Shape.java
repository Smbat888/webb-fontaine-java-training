package classwork.oop.abstracts;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
