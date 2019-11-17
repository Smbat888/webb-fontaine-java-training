package week4.homework.line;

import week4.homework.line.Line;
import week4.homework.line.Point;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Main {
    public static void main(String[] args) {

        Line line = new Line(1.5, 3.6);
        Point point = new Point(5, 6);

        System.out.println(line.isPointOnLine(point));

        Point point2 = new Point(4.5, 5.5);
        Point pointUnknown = new Point(6.3, 2.5);


        if (Point.findPoint(point, point2, pointUnknown)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        Point.distanceBetweenPoints(point, point2);

        Point.mediumDot(point, point2);
//print  point in X,Y axis
        System.out.println("---------");
        for (int i = 20; i >= 0; i--) {
            if (i != 20) {
                System.out.print("  ");
            }
            for (int j = 20; j >= 0; j--) {
                if (i == 20 - point.getY() && j == 20 - point.getX()) {
                    System.out.print("T");
                    continue;
                }
                if (i == 20) {
                    System.out.println("*");
                    continue;
                }
                if (j == 20) {
                    System.out.print(" * ");
                    continue;
                }
            }
        }

    }
}
