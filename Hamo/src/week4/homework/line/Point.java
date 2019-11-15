package week4.homework.line;


/**
 * Created by: Hmayak on Nov, 2019
 */
public class Point {


    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    static double d;


    public static boolean findPoint(Point point, Point point2, Point pointUnknown) {
        if (pointUnknown.getX() > point.getX() && pointUnknown.getX() < point2.getX() &&
                pointUnknown.getY() > point.getY() && pointUnknown.getY() < point2.getY()) {
            return true;
        }
        return false;
    }

    public static void distanceBetweenPoints(Point point, Point point2) {
        d = Math.sqrt(((point2.getX() - point.getX()) * (point2.getX() - point.getX()))) + ((point2.getY() - point.getY()) * (point2.getY() - point.getY()));
        System.out.println("the lenght is " + d);
    }

    public static void mediumDot(Point point, Point point2) {
        double mediumX = (point.getX() + point2.getX()) / 2;
        double mediumY = (point.getY() + point2.getY()) / 2;
        System.out.println("mediumX is :" + mediumX + "medium Y is: " + mediumY);
    }


}
