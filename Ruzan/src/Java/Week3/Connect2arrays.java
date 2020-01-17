package Java.Week3;



import java.util.Arrays;

public class Connect2arrays {
    public static void main(String[] args) {
        int array1[] = {12, 2, 8, 56};
        int array2[] = {3, 85, 96, 4, 2, 7};


        int length = array1.length + array2.length;
        int array3[] = new int[length];
//
//        for (int i = 0; i < array1.length; i++) {
//            array3[i] = array1[i];
//        }
//        for (int j = array1.length, z = 0; j < array3.length; j++, z++) {
//            array3[j] = array2[z];
//        }
//        System.out.println(Arrays.toString(array3));
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        int average1 = sum1 /array1.length;
        for (int i=0; i<array2.length; i++){
            sum2 +=array2[i];
        }
        int average2 = sum2 /array2.length;
        int total = average1 + average2;
        System.out.println("The average of two arrays will be "+ total);
    }
}