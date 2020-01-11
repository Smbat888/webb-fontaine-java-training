package Week3;
import java.util.Scanner;
public class N6_Add10percent {
    public static void main(String[] args) {
        double[] array = {2, 34, 20, 67};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        percent(array, number);
    }
    private static void percent(double[] array, int number) {
        array[number] = array[number] + (array[number] * 10 / 100);
        for (int i=0; i<=array.length-1; i++) {
            System.out.print(array[i]);
        }
    }
}