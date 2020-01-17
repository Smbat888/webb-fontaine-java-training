package Java.Week3;

import java.security.PublicKey;
import java.util.Arrays;

public class Reduplicateby3 {

    public static void main(String[] args) {
        String array [] = {"AAA", "BBB","CCC", "DDD"};
    doubles(array);
        System.out.println(Arrays.toString(array));


    }

    public static void doubles(String[] array) {
        for (int i=0; i<array.length; i++){
            array [i] = array[i] + array[i] + array[i];
        }

    }

}
