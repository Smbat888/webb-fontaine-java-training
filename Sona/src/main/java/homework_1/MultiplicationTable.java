package main.java.homework_1;


import java.util.Scanner;

public class MultiplicationTable {

    private static void multiplication(int number) {
        int multiply;
        for (int i = 1; i <= 9; i++) {
            multiply = number * i;
            System.out.println(number + "x" + i + "=" + multiply);
        }
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        multiplication(number);
    }
}
