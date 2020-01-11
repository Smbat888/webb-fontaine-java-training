package Week1;
import java.util.Scanner;
public class N5_PrimeNumber {
    public static void main (String[] args) {

        Scanner num = new Scanner (System.in);
        System.out.println("Type a number: ");
        int a = num.nextInt();

        if(a==0 || a==1) {
            System.out.print("The number is not prime.");
        }
        else {
            primeChecker(a);
        }
    }
    public static void primeChecker(int a) {

        for(int i = 2; i <= a; i++) {
            if (a%i == 0 && a != i) {
                System.out.print("The number is not prime.");
                break;
            }
            else {
                System.out.print("The number is prime.");
                break;
            }
        }
    }
}
