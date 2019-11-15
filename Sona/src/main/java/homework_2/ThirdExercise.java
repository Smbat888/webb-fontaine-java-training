package main.java.homework_2;

import java.util.Scanner;

public class ThirdExercise {

    private static void calculation(int number1){
int firstNumber = number1/100;
int average1 = number1 - (firstNumber * 100);
int secondNumber = average1/10;
int average2 = average1 - (secondNumber * 10);
        int[] numbers = new int[3];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = average2;
        System.out.println( firstNumber + "," + secondNumber+ "," +average2);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number with 3 digits");
        int number1 = scanner.nextInt();
        calculation(number1);
    }
}
