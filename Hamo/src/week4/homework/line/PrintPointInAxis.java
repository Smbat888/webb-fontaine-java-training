package week4.homework.line;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class PrintPointInAxis {
    public static void main(String[] args) {

        boolean printed = false;

        Point point = new Point(7, 5);
        for (int i = 10; i >= 0; i--) {
            if (i != 10) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 10; j++) {
//                if (i == point.getY() && j == point.getX()) {
//                    System.out.print("T");
//                    continue;
//                }
                if (i == point.getY() && !printed) {
                    printed = true;
                    System.out.println("      *");
                    continue;
                } else if (i == 10) {
                    System.out.println("*");
                    continue;
                }
                if (j == 10) {
                    System.out.print(" * ");
                    continue;
                }
            }
        }
    }
}
