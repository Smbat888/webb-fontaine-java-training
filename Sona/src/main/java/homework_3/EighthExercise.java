package main.java.homework_3;

import java.util.Scanner;

public class EighthExercise {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number = scanner.nextInt();
        int factorial = factorialCalculation(number);
        System.out.println("The factorial of the entered number is:" + factorial);
    }

    private static int factorialCalculation(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialCalculation(number - 1);
    }


}

