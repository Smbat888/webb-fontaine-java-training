package week3;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(0, 1, 12, 2);
    }

    public static void fibonacci(int n1, int n2, int index, int count) {
        if (count < index) {
            int number = n1 + n2;
            System.out.println(number + " ");
            fibonacci(n2, number, index, ++count);
        }
    }

    public static int fibonacciindexN(int n) {
        if (n > 2) {
            return fibonacciindexN(n - 1) + fibonacciindexN(n - 2);
        } else {
            return 1;
        }
    }


}
