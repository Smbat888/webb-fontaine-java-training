package conditions1;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class Lusin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please type your weight to measure in the moon:");
        System.out.println("Your weight should be in the moon: " + lusinWeight(sc.nextByte()) + "KG");
    }

    public static double lusinWeight(byte b) {
        return b * 0.17;
    }
}
