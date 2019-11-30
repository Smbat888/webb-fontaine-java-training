package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class W2HW4 {


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }
        System.out.println("Enter the length of the array:");
        int length2 = s.nextInt();
        int [] myArray2 = new int[length2];


        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length2; i++ ) {
            myArray2[i] = s.nextInt();
        }



        int firstArrayLength = myArray.length;
        int secondArrayLength = myArray2.length;
        int[] result = new int[firstArrayLength + secondArrayLength];
        System.arraycopy(myArray, 0, result, 0, firstArrayLength);
        System.arraycopy(myArray2, 0, result, firstArrayLength, secondArrayLength);
        System.out.println(Arrays.toString(result));


    }
}
