package Java.Week3;


import java.util.Arrays;

public class DeleteX {

    public static void main(String[] args) {

        String array[] = {"AxBx", "CxD", "xExFx"};
        Replace(array);
    }

    public static void Replace(String[] array) {
        String newArray[] = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i].replace("x", "");
        }
        System.out.println("The initial array is " + Arrays.toString(array));
        System.out.println("The new array is " + Arrays.toString(newArray));
    }
}