package classwork.oop.interfaces;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(12, 34);
        System.out.println("before move =" + dot);
        dot.moveLeft(1);
        dot.moveUp(56);
        System.out.println("after move = " + dot);
        Circle circle = new Circle(10, dot);
        System.out.println("circle before move " + circle);
        circle.moveDown(8);
        circle.moveRight(3);
        System.out.println("circle after move " + circle);
        System.out.println("after move = " + dot);
    }
}
