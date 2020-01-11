package Week1;

import java.util.Scanner;

public class W1HW8 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Please enter coordinated of 2 cities");
        double long1= s.nextDouble();
        double lat1= s.nextDouble();
        double long2= s.nextDouble();
        double lat2= s.nextDouble();

        double Distance = Math.sqrt(  (long1-long2)*(long1-long2) +   (lat1-lat2)*(lat1-lat2));

        System.out.println(Distance);

        double MiddleLong=(long1 + long2)/2;
        double MiddleLat=(lat1+lat2)/2;

        System.out.println(MiddleLong + MiddleLat);

    }




}
