package Koordinats;
import java.util.Scanner;
import static Koordinats.PointUtils.*;

/**
 * Created By Arshak on Nov, 2019
 */
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq voronman tarberake:");
        System.out.println(" ");
        System.out.println("For find is point on line, select 1");
        System.out.println("For find middle point,select 2");
        System.out.println("For find distance between, select 3");
        System.out.println(" ");
        int z = input.nextInt();

        if (z == 1) {
            System.out.println("Mutqagreq arajin koordinate ");
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            Point arajin = new Point(x1, y1);
            System.out.println("Mutqagreq erkrord koordinate ");
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            Point erkrord = new Point(x2, y2);
            System.out.println("Mutqagreq errord koordinate ");
            int x3 = input.nextInt();
            int y3 = input.nextInt();
            Point errord = new Point(x3, y3);

            isOnLine(arajin, erkrord, errord);
        }

        if (z == 2) {
            System.out.println("Mutqagreq arajin koordinate ");
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            Point arajin = new Point(x1, y1);
            System.out.println("Mutqagreq erkrord koordinate ");
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            Point erkrord = new Point(x2, y2);
            middlePoint(arajin, erkrord);

        }
        if (z ==3) {
            System.out.println("Mutqagreq arajin koordinate ");
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            Point arajin = new Point(x1, y1);
            System.out.println("Mutqagreq erkrord koordinate ");
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            Point erkrord = new Point(x2, y2);
            heravorutyun(arajin, erkrord);

        }
    }
}
