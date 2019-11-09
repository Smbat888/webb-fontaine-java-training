package Week2;

import java.util.Scanner;

public class EX8_MaxAndMinOfArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];
        int max = numbers[0][0];
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("numbers[" + i + "][" + j + "]= " + numbers[i][j]);
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    min = max;
                } else if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println("Max is:" + max);
        System.out.println("Min is:" + min);
    }
}
