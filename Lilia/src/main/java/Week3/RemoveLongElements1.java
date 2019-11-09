package Week3;

import java.util.Scanner;

public class RemoveLongElements1 {
    public static void main(String[] args) {
        String first[] = {"long", "short", "two", "seven", "on", "say"};
        String second[] = new String[first.length];
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size:");
        int num = size.nextInt();
        for (int i = 0; i < first.length; i++) {
            if (first[i].length() < num) {
                second[i] = first[i];
                System.out.print(String.format("[%s]", second[i]));
            }

        }
    }
}
