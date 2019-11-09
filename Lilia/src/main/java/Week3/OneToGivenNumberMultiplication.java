package Week3;

import java.util.Scanner;

public class OneToGivenNumberMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        System.out.println(String.format("The Multiplication is %d", multi(num)));
    }

    static int multi(int n) {
        if (n != 0 && (n-1 != 0)){
            return n*multi(n-1);
        }else{
            return n;
        }
    }
}
