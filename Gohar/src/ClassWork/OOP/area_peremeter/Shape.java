package ClassWork.OOP.area_peremeter;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double getArea();
    abstract double getPerimeter();

}
