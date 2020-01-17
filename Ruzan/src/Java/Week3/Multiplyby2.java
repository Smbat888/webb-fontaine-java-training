package Java.Week3;

import java.util.Arrays;

public class Multiplyby2 {
    public static void main(String args[]) {

        int a[] = {25, 65, 78, 22, 1, 3};
        int[] b = new int[6];
        toDouble (a);

    }

    public static void toDouble(int[] a) {

        int[] b = new int[6];
        for (int i = 0; i < a.length; i++) {
            b [i] = a[i] * 2;


        }
        System.out.println(Arrays.toString (a));
        System.out.println(Arrays.toString(b));
    }
}






