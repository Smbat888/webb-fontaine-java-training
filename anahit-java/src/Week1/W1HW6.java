package src.Week1;

import java.util.Scanner;

public class W1HW6 {

    public static void main(String[] args) {
        int x = 3;
        System.out.println(getneristPrimeNumber(x));
    }

    public static boolean isPrime(int number){
        for(int i =2; i< number/2; i++){
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

    public static int  getneristPrimeNumber(int number){
        do {
            if (isPrime(number)) {
                return number;
            }
            number++;
        }while (true);

    }
}