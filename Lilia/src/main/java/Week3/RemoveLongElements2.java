package Week3;

import java.util.Scanner;

public class RemoveLongElements2 {
    public static void main(String[] args) {
        String first[] = {"long", "short", "two", "seven", "on", "say"};
        String second[] = new String[first.length];
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size:");
        int num = size.nextInt();
        fillSecondArray(first, second, num);
        print(second);
    }


    private static void fillSecondArray(String array[], String array1[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < x) {
                array1[i] = array[i];
            }
        }
    }
    private static void print (String[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ] ");
        }
    }
}