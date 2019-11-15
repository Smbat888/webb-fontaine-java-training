package main.java.homework_3;

import java.util.Scanner;

public class SeventhExercise {

    public static void main(String args[]) {
        int number = typing();
        int fibonacci = fibonacciCalculation(number);
        System.out.println("The fibonacci number is:" + fibonacci);
    }

    static int typing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter which number by count you want to get from Fibonacci sequence");

        int number = scanner.nextInt();

        return number;
    }

    static int fibonacciCalculation(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return (fibonacciCalculation(number - 1)) + fibonacciCalculation(number - 2);
    }
}
