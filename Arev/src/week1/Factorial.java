package week1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please print number for counting factorial: ");
        int number = num.nextInt();
        System.out.println("Factorial for this number equal to  " + factorial(number));
    }

    public static double factorial(int number) {
        if ((number == 0) || (number == 1)) {
            return 1;
        } else
            return number * factorial(number - 1);
    }
}
