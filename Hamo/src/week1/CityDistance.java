package week1;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 * <p>
 * 8. Գրել ծրագիր, որը կառաջարկի մուտքագրել 2 քաղաքների կոորդինատները (latitude, longitude, դրանք double տիպի էն) եւ կհաշվի;
 * 1) 2 քաղաքների միջեւ հեռավորությունը
 * 2) դրանց միջեւ ընկած միջանկյալ կետը
 */
public class CityDistance {
    static Scanner scanner = new Scanner(System.in);
    static double d;

    public static void main(String[] args) {
        System.out.println("type the coordinates of cities");
        cityDistance(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("type the coordinates of cities");
        mediumDot(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }

    public static void cityDistance(double cityOneX, double cityOneY, double cityTwoX, double cityTwoY) {
        d = Math.sqrt(((cityTwoX - cityOneX) * (cityTwoX - cityOneX))) + ((cityTwoY - cityOneY) * (cityTwoY - cityOneY));
        System.out.println("the lenght is " + d);
    }

    public static void mediumDot(double cityOneX, double cityOneY, double cityTwoX, double cityTwoY) {
        double mediumX = (cityOneX + cityTwoX) / 2;
        double mediumY = (cityOneY + cityTwoY) / 2;
        System.out.println("mediumX is :" + mediumX + "medium Y is: " + mediumY);
    }
}
