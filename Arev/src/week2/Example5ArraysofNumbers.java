package week2;

import java.util.Arrays;

public class Example5ArraysofNumbers {
    public static int[] array = new int[20];
    public static int[] prime = new int[20];
    public static int[] even = new int[20];
    public static int[] odd = new int[20];

    public static void main(String[] args) {


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));

        System.out.println();
        int j = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                prime[j] = array[i];
                j++;
            }
            if (isEven(array[i])) {
                even[x] = array[i];
                x++;
            } else {
                odd[y] = array[i];
                y++;
            }
        }

        System.out.print("Even Numbers:");
        print(even);
        System.out.println();
        System.out.print("Odd Numbers:");
        print(odd);
        System.out.println();
        System.out.print("Prime Numbers");
        print(prime);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }
}

