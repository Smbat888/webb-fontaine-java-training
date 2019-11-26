package Week1;

import java.util.Scanner;

public class W1HW6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number");
        boolean isPrime = true;
        int mnatsord;
        int x = s.nextInt();
        if (x == 0 || x == 1) {

            System.out.println(x + " is not a prime number");
            return;
        }

        for (int i = 2; i <= x / 2; i++) {
            mnatsord = x % i;

            if (mnatsord == 0) {
                isPrime = false;
                break;
            }
        }


    }
}