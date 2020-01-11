package Week3;
import java.util.Scanner;

public class N4_ShortArrays {
    public static void main (String[] args) {
        String[] array = {"this", "is", "a", "sentence"};
        shorter (array);
    }

    private static void shorter (String[] array) {
        Scanner num = new Scanner (System.in);
        System.out.println("Type a number: ");
        int a = num.nextInt();

        for(int i=0; i<=array.length; i++) {
            if(array[i].length() >= a) {
                System.out.println(array[i].replace(array[i],""));
            }
            else{
                System.out.println(array[i]);
            }
        }
    }
}