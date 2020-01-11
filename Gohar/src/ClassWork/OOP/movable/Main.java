package ClassWork.OOP.movable;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(12, 34);
        System.out.println("dot = " + dot);

        dot.moveLeft(1);
        dot.moveUp(56);

        System.out.println("after move = " + dot);

        Circle circle = new Circle(10, dot);
        System.out.println("circle before move = " + circle);
        circle.moveDown(8);
        circle.moveRight(3);

        System.out.println("circle after move = " + circle);


    }
}
