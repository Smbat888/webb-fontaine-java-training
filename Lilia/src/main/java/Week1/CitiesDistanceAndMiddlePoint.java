package Week1;

import java.util.Scanner;

public class CitiesDistanceAndMiddlePoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Latitude 1:");
        double x1 = input.nextDouble();
        System.out.println("Enter Longitude 1:");
        double y1 = input.nextDouble();
        System.out.println("Enter Latitude 2:");
        double x2 = input.nextDouble();
        System.out.println("Enter Longitude 2:");
        double y2 = input.nextDouble();
        System.out.println("The Distance Is:");
        System.out.println(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
        System.out.println("Middle Latitude is:"+ (x1+x2)/2);
        System.out.println("Middle Longitude is:"+ (y1+y2)/2);
    }
}