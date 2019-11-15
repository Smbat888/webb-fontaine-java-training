package main.java.homework_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Waiter {

    private static void waitForSeconds(long number) {
        try {
            TimeUnit.SECONDS.sleep(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finish");

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of seconds");
        long number = scanner.nextInt();
        waitForSeconds(number);
    }
}
