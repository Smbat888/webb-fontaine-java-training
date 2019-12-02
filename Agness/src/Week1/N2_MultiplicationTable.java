package Week1;
import java.util.Scanner;

public class N2_MultiplicationTable {
    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);

        System.out.print("Type a number: ");
        table(num.nextInt());
    }

    public static void table (int a) {
        for (int i = 1; i<=9; i++){
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}
