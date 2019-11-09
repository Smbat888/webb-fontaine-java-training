package Week1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = input.nextInt();
        int fact = num;
        for (int i = 2; i < num; i++) {
            fact *= i;
        }
        System.out.println("The Factorial is:" + fact);
    }
}
