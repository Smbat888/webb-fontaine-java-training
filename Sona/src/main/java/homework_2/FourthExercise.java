package main.java.homework_2;

import java.util.Scanner;

public class FourthExercise {

    private static void fromDoubleToSingle(int[][] doubleArray) {
        int a = 0;
        int[] singleArray = new int[9];

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < 3; j++) {
                singleArray[a] = doubleArray[i][j];
                System.out.print("{" + singleArray[a] + "}");
                a++;
            }
        }
    }

    public static void main(String args[]) {
        int[][] doubleArray = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                System.out.println("Please enter number");
                doubleArray[i][j] = scanner.nextInt();
            }
        }
        fromDoubleToSingle(doubleArray);
    }
}
