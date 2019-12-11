package classprojects;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(){

    }
    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width, String color){
//        super(color);
        this(length,width);
        setColor(color);

    }
    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return 2*(width*length);
    }

    @Override
    public String toString() {
        return String.format("rectangle: {color: %s, area: %f, perimeter: %f}",
                getColor(), getArea(), getPerimeter());
    }
}
