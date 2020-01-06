package classwork.oop.abstracts;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */

public class Main {
    public static void main(String[] args) {

        //circle
        Shape circle = new Circle(5.0, "Red");
        printShape(circle);

        //rectangle
        Shape rectangle = new Rectangle("Black", 3.5, 2.0);
        printShape(rectangle);

        //square
        Rectangle square = new Square(4.0, "Yellow");
        printShape(square);
    }

    public static void printShape(Shape shape) {
        System.out.println(shape);
        System.out.println();
    }
}
