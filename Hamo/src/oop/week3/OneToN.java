package oop.week3;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class OneToN {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }

    public static int recursion(int n) {

        if (n == 1) {
            return 1;
        }

        return recursion(n - 1) * n;

    }
}
