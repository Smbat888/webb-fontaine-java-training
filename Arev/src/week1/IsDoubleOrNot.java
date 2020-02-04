package week1;

import java.util.Scanner;


public class IsDoubleOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number ");

        if (scanner.hasNextDouble()) {
            System.out.println("This number is double  " + scanner.nextDouble());
        } else {
            System.out.println("This is not a double number " + scanner.next());
        }
    }
}


