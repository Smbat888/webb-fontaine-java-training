package Week3;
import java.util.Scanner;
public class N5_2_AvgOfArrays {
    public static void main(String[] args) {
        double[] array1 = {1,2,3,4};
        double[] array2 = {5,6,7,8};
        avg(array1, array2);
    }
    public static void avg(double[] array1, double[] array2) {
        double sum1=0;
        for (int i=0; i<= array1.length-1; i++) {
            sum1 += array1[i];
        }
        double sum2=0;
        for (int j=0; j<= array2.length-1; j++) {
            sum2 += array2[j];
        }
        System.out.println((sum1/array1.length)+(sum2/array2.length));
    }
}