package Week4.Point_And_Line;

public class Line {
    private double k;
    private double b;
    private Integer x;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Line(Point p1, Point p2) {
        if (p1.getX() == p2.getX()) {
            x = p1.getX();
        } else {
            k = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
            b = p1.getY() - k * p1.getX();
        }
    }

    public boolean isPointOnLine(Point point) {
        if (x != null) {
            return point.getX() == x;
        }
        double y = k * point.getX() + b;
        return Math.abs(point.getY() - y) < 0.03;
//        return point.getY() == y;
    }
}
