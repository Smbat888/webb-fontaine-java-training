package main.java.homework_1;


import java.util.Scanner;

public class Gravity {

    private static void calculation(double weight) {
        double m = weight * 0.17;
        System.out.println(m);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight");

        double weight = scanner.nextDouble();
        calculation(weight);
    }
}
