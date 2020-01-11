package Koordinats;
import java.util.Scanner;

/**
 * Created By Arshak on Nov, 2019
 */
public class PointUtils {

    public static void isOnLine(Point koordinat1, Point koordinat2, Point koordinatAnhayt) {

        if ((koordinatAnhayt.getX() - koordinat1.getX()) / (koordinat2.getX() - koordinat1.getX()) == (koordinatAnhayt.getY() - koordinat1.getY()) / (koordinat2.getY() - koordinat1.getY())) {
            System.out.println("Point is on line");
        } else {
            System.out.println("Point is not on line");
        }

    }

    public static void middlePoint(Point koordinat1, Point koordinat2) {
        int middleX = ((koordinat1.getX() + koordinat2.getX()) / 2);
        int middleY = ((koordinat1.getY() + koordinat2.getY()) / 2);
        Point middle = new Point(middleX, middleY);
        System.out.println(middle.toString());
    }

    public static void heravorutyun(Point koordinat1, Point koordinat2) {
        double her1 = Math.sqrt(((koordinat2.getX() - koordinat1.getX()) * (koordinat2.getX() - koordinat1.getX())));
        double her2 = ((koordinat2.getY() - koordinat1.getY()) * (koordinat2.getY() - koordinat1.getY()));
        System.out.println("Distance is " + " " + "=" +" " + her1+her2);


    }
}
