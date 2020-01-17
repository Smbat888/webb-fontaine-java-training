package Java.Week3;

import java.util.Arrays;

public class Plus10percent {
    public static void main(String[] args) {
        int array1[] = {12, 56, 89, 1, 56, 71, 11};
//        int array2 [] = new int [array1.length];
//
//
//        for(int  i = 0; i < array1.length; i++) {
//            array2 [i] = array1[i] + ((array1[i] * 10) / 100);
//        }
//        System.out.println("The initial array was " +Arrays.toString(array1));
//        System.out.println("The new array is " +Arrays.toString(array2));
//    }
//}
         for (int i = 0; i < array1.length; i++) {
             if (i == 4) {
                 array1[4] = array1[4] + ((array1[4] * 10) / 100);
             }
         }
        System.out.println("The new array is " +Arrays.toString(array1));
    }
}