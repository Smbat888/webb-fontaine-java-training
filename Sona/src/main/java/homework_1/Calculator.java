package main.java.homework_1;

import java.util.Scanner;

public class Calculator {

    private static void calculation(double number1, double number2, char operation) {
        switch (operation) {
            case '+':
                System.out.println(number1 + " " + operation + " " + number2 + "=" + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " " + operation + " " + number2 + "=" + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " " + operation + " " + number2 + "=" +(number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("The second number can't be equal to 0");
                } else {
                    System.out.println(number1 + " " + operation + " " + number2 + "=" + (number1 / number2));
                }
                break;
            default:
                System.out.println("Try again");
        }
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter the second number");
        double number2 = scanner.nextDouble();
        System.out.println("Please enter the operation");
        char operation = scanner.next().charAt(0);
        calculation(number1, number2, operation);
    }
}
