package classwork.oop.interfaces;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Dot implements Movable {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void moveUp(int step) {
        y += step;
    }

    @Override
    public void moveDown(int step) {
        y -= step;
    }

    @Override
    public void moveLeft(int step) {
        x -= step;
    }

    @Override
    public void moveRight(int step) {
        x += step;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
