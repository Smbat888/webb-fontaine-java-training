package main.java.homework_1;

import java.util.Scanner;

public class TheSumAndTheAverageOfTheNumbers {

    private static void theSumAndTheAverage(int number1, int number2) {
        int sum = 0;
        double average = 0;
        if (number1 < number2) {
            average = number2 - number1;
            for (int i = number1; i <= number2; i++) {
                sum = sum + i;
            }
        }
        if (number1 > number2) {
            average = number1 - number2;
            for (int i = number2; i <= number1; i++) {
                sum = sum + i;
            }
        }
        if (number1 == number2) {
            sum = number1;
            average = 0;
        }

        System.out.println("The sum of the numbers between the entered numbers is:" + sum);
        System.out.println("The average of the numbers between the entered numbers is:" + sum / average);
    }


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();
        theSumAndTheAverage(number1, number2);
    }
}
