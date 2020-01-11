package Week1;
import java.util.Scanner;

public class N3_Moon {
    public static void main (String[] args) {

        Scanner weight = new Scanner (System.in);
        System.out.print("Type your weight: ");
        double count = weight.nextDouble();
        System.out.println("Your weight on the Moon will be: " + count*0.17);
    }
}
