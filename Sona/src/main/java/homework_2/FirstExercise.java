package main.java.homework_2;

import java.util.Scanner;

public class FirstExercise {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }
        int average = sum / 10;
        System.out.println("The average of the entered numbers is:" + average);
    }
}
