package ClassWork.OOP.area_peremeter;

public class Circle extends Shape {
    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("circle: {color: %s, area: %f, perimeter: %f}",
                getColor(), getArea(), getPerimeter());
    }
}
