package main.java.homework_1;


import java.util.Scanner;

public class IsDoubleOrNot {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");

        if (scanner.hasNextDouble()) {
            System.out.println("Entered number is double");
        } else {
            System.out.println("Entered number is not double");
        }
    }
}