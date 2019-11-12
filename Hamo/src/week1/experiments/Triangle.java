package week1.experiments;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class Triangle {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
