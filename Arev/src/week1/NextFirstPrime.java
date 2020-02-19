package conditions1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class NextFirstPrime {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner num = new Scanner(System.in);
        int number;
        while ((number = num.nextInt()) != 0) {
            while (!isPrime(number)) {
                number++;
            }

            System.out.println("The next prime number is: " + number);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;

        } else if ((number == 2) || (number == 3)) {
            return true;
        } else
            for (int i = 2; i <= sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
