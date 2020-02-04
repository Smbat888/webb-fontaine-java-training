package week2;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix:");
        int[][] matrix = {{4, 5, 6, 7, 8}, {47, 8, 9, 6, 2}};
        int[] myArray = new int[10];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("numbers[" + i + "][" + j + "]= " + matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                myArray[k] = matrix[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}

