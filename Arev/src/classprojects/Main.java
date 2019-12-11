package classprojects;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0,"RED");
        //circle
        printShape(circle);


        //rectangle
        Shape rectangle = new Rectangle(3.5,2.0,"PINK");
        printShape(rectangle);

        //square
        Rectangle squeare = new Square(4.0,"BLACK");
        printShape(squeare);
    }
    public static void printShape(Shape shape){
        System.out.println("shape = " + shape.toString());
    }
}
