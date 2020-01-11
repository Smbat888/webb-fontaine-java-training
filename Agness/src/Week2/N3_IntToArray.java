package Week2;
import java.util.Scanner;
public class N3_IntToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = input.nextInt();
        String value = Integer.toString(number);
        String[] result = value.split("");
        for (String i: result) {
            String str = String.format("%s, ", i);
            System.out.print(str);
        }
    }
}