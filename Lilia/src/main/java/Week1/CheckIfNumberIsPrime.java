package Week1;

import java.util.Scanner;

public class CheckIfNumberIsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        boolean isPrime = false;
        if (number == 0 || number == 1) {
            System.out.println("NotAPrimeNumber");
            return;
        }
        for (int i = 2; i < number / 2; i++) {
            isPrime = (number % i != 0);
            break;
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}

