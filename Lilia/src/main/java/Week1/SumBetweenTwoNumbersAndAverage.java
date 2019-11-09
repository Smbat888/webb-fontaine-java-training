package Week1;

import java.util.Scanner;

public class SumBetweenTwoNumbersAndAverage {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sum = 0;
        int avg;
        System.out.println("Enter the first number:");
        int firstNum = num.nextInt();
        System.out.println("Enter the second number:");
        int secondNum = num.nextInt();
        int max = Math.max(firstNum, secondNum);
        int min = Math.min(firstNum, secondNum);
        int difference = (max - min) + 1;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        avg = sum / difference;
        System.out.println("The sum of numbers between is :" + sum);
        System.out.println("The average is:"+avg);
    }
}
