package Week2;

import java.util.Scanner;

public class W2HW10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] finalArray = null;
        System.out.print("Enter a number to be deleted");
        int x = in.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                finalArray = new int[array.length - 1];
                for (int j = 0; j < i; j++) {
                    finalArray[j] = array[j];
                }
                for (int j = i; j < array.length - 1; j++) {
                    finalArray[j] = array[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]);
        }

    }
}