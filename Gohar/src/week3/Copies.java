package week3;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class Copies {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = {"r", "7", "9"};
        String[] array2 = new String[array.length];
        for (int i = 0; i<array.length; ++i){
            String cur = array[i];
            array2[i] = String.format("%s%s%s", cur, cur,cur);
            System.out.println(array2[i]);
        }
    }
}
