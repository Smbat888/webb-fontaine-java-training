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

//    static double d;
//
//    public static void main(String[] args)
//    {
//
//        // bottom-left and top-right
//        // corners of rectangle
//        int x1 = 0, y1 = 0,
//                x2 = 10, y2 = 8;
//
//        // given point
//        int x = 1, y = 5;
//
//        // function call
//        if (findPoint(x1, y1, x2, y2, x, y))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//
//    public static void distanceBetweenPoints(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY) {
//        d = Math.sqrt(((pointTwoX - pointOneX) * (pointTwoX - pointOneX))) + ((pointTwoY - pointOneY) * (pointTwoY - pointOneY));
//        System.out.println("the lenght is " + d);
//    }
//
//    public static void mediumDot(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY) {
//        double mediumX = (pointOneX + pointTwoX) / 2;
//        double mediumY = (pointOneY + pointTwoY) / 2;
//        System.out.println("mediumX is :" + mediumX + "medium Y is: " + mediumY);
//    }
//
//    static boolean findPoint(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY,
//                             double pointUnknownX, double pointUnknownY) {
//        if (pointUnknownX > pointOneX && pointUnknownX < pointTwoX &&
//                pointUnknownY > pointOneY && pointUnknownY < pointTwoY) {
//            return true;
//        }
//        return false;
//    }


}
