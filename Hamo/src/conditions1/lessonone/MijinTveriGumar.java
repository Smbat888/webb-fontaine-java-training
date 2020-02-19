package conditions1.lessonone;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 * 10. Գրել ծրագիր, որը  կհաշվի մուտքագրված 2 թվերի միջեւ ընկած թվերի գումարը եւ միջին թվաբանականը.
 */
public class MijinTveriGumar {
    static Scanner scanner = new  Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Type 1st then second numbers");
        mijinGumar(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Type 1st then second numbers");
        mijinTvabanakan(scanner.nextDouble(), scanner.nextDouble());
    }

    public static void mijinGumar(double a, double b) {
        int c = 0;
        while (a < b - 1) {
            a++;
            c += a;
        }
        System.out.println("Mijin tveri gumar is: " + c);
    }

    public static void mijinTvabanakan(double a, double b) {
        System.out.println("Mijin tvabanakan is: " + (a + b) / 2);

    }
}