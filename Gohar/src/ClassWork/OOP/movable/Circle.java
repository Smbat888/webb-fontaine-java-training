package ClassWork.OOP.movable;

public class Circle implements Movable {

    private int radius;
    private Dot dot;

    public Circle(int radius, Dot dot) {
        this.radius = radius;
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
    public String toString() {
        return String.format("circle: {radius: %d, dot: %s}", radius, dot);
    }
}
