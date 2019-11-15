package main.java.homework_2;

import java.util.Arrays;

public class FifthExercise {

    public static void main(String args[]) {
        int[] generalArray = new int[11];
        int[] primeArray = new int[11];
        int[] pairArray = new int[11];
        int[] oddArray = new int[11];

        for (int i = 0; i < generalArray.length; i++) {
            int item = (int) (Math.random() * 10);
           generalArray[i] = item;
           if(isPair(item)) {
               pairArray[i] = item;
           }else{
               oddArray[i] = item;
           }
           if (isPrime(item)){
               primeArray[i] = item;
           }
        }
        System.out.println("General array is" + Arrays.toString(generalArray) );
        System.out.println("Odd array is" + Arrays.toString(oddArray));
        System.out.println("Pair array is" + Arrays.toString(pairArray));
        System.out.println("Prime array is" + Arrays.toString(primeArray));
    }

    static boolean isPair(int i){
        boolean isPair = false;
        if (i % 2 == 0){
            isPair = true;
        }
        return isPair;
    }

    static boolean isPrime(int i){
        boolean isPrime = true;
        for(int j = 2; j <=i/2; j++){
            if (i % j == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
