package main.java.homework_1;

public class PrimeNumberSum {

    public static void main(String args[]) {
        int sum = 0;
        for (int i = 2; i <= 100; ++i) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
