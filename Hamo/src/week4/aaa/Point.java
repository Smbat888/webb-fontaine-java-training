package week4.aaa;

/**
 * Created by: Hmayak Atayan on 19 December, 2019
 */
public class Point {
    public int a;
    public int b;

    Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return String.format(("%d,%d"), a, b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
