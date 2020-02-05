package week1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number for checking prime : ");
        int number = num.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else
            System.out.println(number + " is not prime number");


    }

    private static boolean isPrime(int number) {
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
