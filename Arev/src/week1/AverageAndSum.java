package conditions1;

import java.util.Scanner;

public class AverageAndSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstnumber = num.nextInt();
        System.out.println("Please enter second number: ");
        int secondnumber = num.nextInt();
        int min = Math.min(firstnumber, secondnumber);
        int max = Math.max(firstnumber, secondnumber);
        System.out.println("Sum of numbers between this two number equal to: " + sumOfNumbersBetWeenNumbers(min, max));
        System.out.println("Average of numbers equal to: " + average(min, max));


    }

    public static double sumOfNumbersBetWeenNumbers(int min, int max) {
        double sumOfNumbers = 0;
        for (int i = min + 1; i < max; i++) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }

    public static double average(int min, int max) {
        return sumOfNumbersBetWeenNumbers(min, max) / (max - min - 1);
    }
}
