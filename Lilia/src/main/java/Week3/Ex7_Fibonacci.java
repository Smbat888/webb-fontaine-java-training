package Week3;

import java.util.Scanner;

public class Ex7_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        System.out.println(String.format("The Fibonacci number is:%s", Fibo(num)));
    }

    static int Fibo(int n) {
        if (n<=2) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
