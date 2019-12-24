package classwork.oop.interfaces;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Circle implements Movable {
    private int radius;
    private Dot dot;

    public Circle (int radius, Dot dot){
        this.radius = radius;
        this.dot = dot;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Dot getDot() {
        return dot;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

    @Override
    public void moveUp(int step) {
        dot.setY(dot.getY() + step);
    }

    @Override
    public void moveDown(int step) {
        dot.setY(dot.getY() - step);
    }

    @Override
    public void moveLeft(int step) {
        dot.setX(dot.getX() - step);
    }

    @Override
    public void moveRight(int step) {
        dot.setX(dot.getX() + step);
    }


}
