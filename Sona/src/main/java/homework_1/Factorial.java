package main.java.homework_1;

import java.util.Scanner;

public class Factorial {

    private static void factorialCalculation(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of the entered number is:" + factorial);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number = scanner.nextInt();
        factorialCalculation(number);
    }
}