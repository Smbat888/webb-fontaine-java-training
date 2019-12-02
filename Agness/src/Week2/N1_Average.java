package Week2;
import java.util.Scanner;

public class N1_Average {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        double sum =0;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }
        System.out.println(sum/array.length);
    }
}
