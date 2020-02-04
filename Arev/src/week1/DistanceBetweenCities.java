package week1;

import java.util.Scanner;

public class DistanceBetweenCities {
    public static void main(String[] args) {
        Scanner coordinates = new Scanner(System.in);
        System.out.println("Please enter a latitude for first city: ");
        double x1 = coordinates.nextDouble();
        System.out.println("Please enter a longitude for first city: ");
        double y1 = coordinates.nextDouble();
        System.out.println("Please enter a latitude for second city: ");
        double x2 = coordinates.nextDouble();
        System.out.println("Please enter a longitude for second city: ");
        double y2 = coordinates.nextDouble();
        citydistance(x1, y1, x2, y2);
        intermediatePoint(x1, y1, x2, y2);

    }

    public static void citydistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2));
        System.out.println("The length is " + distance);
    }

    public static void intermediatePoint(double x1, double y1, double x2, double y2) {
        double x3 = (x2 - x1) / 2;
        double y3 = (y2 - y1) / 2;
        System.out.println("Latitude for intermediate point = " + x3);
        System.out.println("Longitude for intermediate point = " + y3);
    }

}
