package Week3;
public class N7_Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n) {
        if (n<=1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n + 2);
        }
    }
}