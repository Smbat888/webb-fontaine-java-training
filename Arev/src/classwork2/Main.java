package classwork2;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(12,34);

        System.out.println("before move = " + dot);

        dot.moveLeft(4);
        dot.moveUp(4);
        System.out.println("dot = " + dot);

        Circle circle  = new Circle(10,dot);
        System.out.println("circle before move = " + circle);

        circle.moveDown(3);
        circle.moveRight(10);
        System.out.println("circle = " + circle);
    }
}
