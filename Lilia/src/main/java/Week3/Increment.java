package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format(" [ %s ]=", i));
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter one of the elements:");
        int num2 = sc.nextInt();
        System.out.println(String.format("The result is: %S", incrementIndex(array, num2)));
    }

    static double incrementIndex(int array1[], int index) {
        return array1[index] * 1.1;
    }
}
