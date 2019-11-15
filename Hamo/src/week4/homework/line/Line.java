package week4.homework.line;

import week4.homework.line.Point;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.b = b;
        this.k = k;
    }

    public boolean isPointOnLine(Point dot) {
        return dot.getY() == k * dot.getX() + b;
    }

    public boolean isCanBeDrawnASQuare(Point p1, Point p2, Point p3, Point p4) {
        if (p1.getX() == p2.getX() && p3.getX() != p2.getX()) {
            if (p4.getX() == p3.getX() && p2.getY() == p3.getY()) {
            }
            return true;
        }
        return false;
    }

    //TODO POINTERI ARRAY


}
