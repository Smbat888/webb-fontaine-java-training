package PointLine;

public class Line {

    private static double k;
    private static double b;
    static Point a;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Line(Point point1, Point point2) {

        k = (point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
        b = a.getY() - k * a.getX();
    }

    public static void isPointOnLine(Point a) {
        if (b == a.getY() - k * a.getX()) {
            System.out.println("a is on the given line");
        } else {
            System.out.println("a is not on the given line");
        }


    }
}