package ClassWork.OOP.area_peremeter;

public class Main {
    public static void main(String[] args) {

        //circle
        Shape circle = new Circle(5.0, "RED");
        printShape(circle);

        //rectangle
        Shape rectangle = new Rectangle(3.5, 2.0, "PINK");
        printShape(rectangle);

        //square
        Rectangle square = new Square(4.0, "BlACK");
        printShape(square);

    }

    public static void printShape(Shape shape){
        System.out.println(shape);
    }
}
