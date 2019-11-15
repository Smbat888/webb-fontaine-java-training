package main.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class FirstExercise {

    public static void main(String args[]) {
        int[] numbers = typing();
        makeDouble(numbers);
    }

    static int[] typing() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[11];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter numbers");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    static void makeDouble(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
