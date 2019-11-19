package week2;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class Avarage {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = {5, 4, 10, 2, 3, 5, 8, 2, 3, 8};
        int n = 0;
        for (int i = 0; i <myArray.length; i++){
            n = n + myArray[i];
        }
        int avarage = n / myArray.length;
        System.out.println(avarage);
    }
}

