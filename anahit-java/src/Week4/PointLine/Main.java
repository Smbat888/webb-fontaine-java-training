package PointLine;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point.distanceBetweenPoints(point1, point2);
        System.out.println(Point.middlePoint(point1, point2));
        Point a = new Point(10, 20);
        Line.isPointOnLine(a);
        Point A = new Point(1, 1);
        Point B = new Point(1, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 1);
        System.out.println(Point.canFormSquare(A, B, C, D));
    }
}
