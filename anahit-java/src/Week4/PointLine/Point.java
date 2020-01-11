package PointLine;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distanceBetweenPoints(Point point1, Point point2) {
        double distance = Math.sqrt(((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()))) + ((point2.getY() - point1.getY()) * (point2.getY() - point1.getY()));
        System.out.println("the distance is " + distance);
        return distance;
    }

    public static Point middlePoint(Point point1, Point point2) {
        Point middlePoint = new Point();
        middlePoint.setX((point1.getX() + point2.getX()) / 2);
        middlePoint.setY((point1.getY() + point2.getY()) / 2);
        return middlePoint;
    }

    public static boolean canFormSquare(Point A, Point B, Point C, Point D) {
        double AB = distanceBetweenPoints(A, B);
        double BC = distanceBetweenPoints(B, C);
        double CD = distanceBetweenPoints(C, D);
        double AD = distanceBetweenPoints(A, D);
        double AC = distanceBetweenPoints(A, C);
        double BD = distanceBetweenPoints(B, D);
        if (AB == AD && BC == CD && AC == BD) {

            System.out.println("the given points form a square");
            return true;
        } else {
            System.out.println("the given points do not forma a square");
            return false;
        }
    }

    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
