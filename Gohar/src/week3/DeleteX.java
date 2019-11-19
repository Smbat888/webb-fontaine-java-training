package week3;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class DeleteX {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = {"axaxxxx", "xbbxxxx", "cxxcx"};
        String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            String cur = array[i];
            array2[i] = cur.replaceAll("x", "");
            System.out.println(array2[i]);
        }
    }
}
