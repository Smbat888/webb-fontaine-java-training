package Week2;

import java.util.Scanner;

public class EX4_MultiArrayToSingleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the array");
        int n=2;
        int m=3;
        int[][] numbers = new int[n][m];
        int[] singleArray = new int[n*m];
        int y = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("numbers [ " + i + " ]" + " [ " + j + " ]" + "= ");
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("numbers[" + i + "][" + j + "]= " + numbers[i][j]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                singleArray[y] = numbers[i][j];
                System.out.print("[ " +singleArray[y]+ " ]");
                y++;
            }
        }
    }
}
