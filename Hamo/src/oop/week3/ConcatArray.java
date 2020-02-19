package oop.week3;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Գրել ֆունկցիաներ, որոնք ստանալով երկու զանգված, կանեն հետեւյալը՝
 * * կկպցնի այդ զանգվածները եւ կվերադարձնի այն.
 * * կգումարի առաջի եւ երկրորդ զանգվածների միջին թվաբ-ը եւ կվերադարձնի
 */
public class ConcatArray {
    public static int tiv[][] = {{1, 2, 3}, {4, 5, 6}};
    public static int[] arr1 = {4, 4, 4, 8};
    public static int[] arr2 = {22, 2, 25, 7};

    public static void main(String[] args) {
        //output for concat arrays
        for (int a : concatArrays(tiv)
        ) {
            System.out.println(a);
        }

        //output for mijintvabanakan()
        System.out.println(mijinTvabanakan(arr1, arr2));
    }

    public static int[] concatArrays(int[][] multidimensionalArray) {
        int newTemp = 0;
        int concatedArray[] = new int[multidimensionalArray[0].length + multidimensionalArray[1].length];
        for (int i = 0; i < multidimensionalArray[0].length; i++) {
            for (int j = 0; j < multidimensionalArray[0].length; j++) {
                int tempo = multidimensionalArray[0].length + multidimensionalArray[1].length;
                if (newTemp < tempo) {
                    concatedArray[newTemp] = multidimensionalArray[i][j];
                    ++newTemp;
                }
            }
        }
        return concatedArray;
    }

    public static int mijinTvabanakan(int[] arr1, int[] arr2) {
        int arr1Gumar = 0, arr2Gumar = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1Gumar += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2Gumar += arr2[i];
        }
        return (arr1Gumar / arr1.length) + (arr2Gumar / arr2.length);
    }
}

