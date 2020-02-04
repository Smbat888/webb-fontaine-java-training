package week1;

import java.util.Scanner;

/**
 * Created by: Arev on Dec, 2019
 **/

public class WeightOnTheMoon {
    public static void main(String[] args) {
        Double weight;
        System.out.println("Enter weight  ");
        Scanner firstWeight = new Scanner(System.in);
        weight = firstWeight.nextDouble();
        System.out.println("Weight on the moon = 0.17*m = " + weight * 0.17);
    }
}
