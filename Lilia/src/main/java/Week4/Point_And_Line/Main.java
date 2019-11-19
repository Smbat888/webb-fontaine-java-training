package Week4.Point_And_Line;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Point 1 : ");
        Point point1 = Helper.point();
        Print.printPoint(point1);
        System.out.print("Point 2 : ");
        Point point2 = Helper.point();
        Print.printPoint(point2);
        System.out.print("The distance between Point 1 and Point 2 : ");
        System.out.println((Helper.distanceBetweenTwoPoints(point1, point2)));
        System.out.print("The middle point of Point 1 and Point 2 ");
        Point middlePoint = Helper.middlePoint(point1, point2);
        Print.printPoint(middlePoint);
        System.out.print("Enter point 3 : ");
        Point point3 = new Point(sc.nextInt(), sc.nextInt());
        Print.pointOnLineResult(Helper.isPointOnLine(point1, point2, point3));
        Print.pointIsInAreaResult(Helper.isPointInArea(DataRepo.sameYPoints(DataRepo.get(),point3),point3));
        System.out.print("Please enter 4 points in clockwise order : ");
        Point p1=new Point(sc.nextInt(),sc.nextInt());
        Point p2=new Point(sc.nextInt(),sc.nextInt());
        Point p3=new Point(sc.nextInt(),sc.nextInt());
        Point p4=new Point(sc.nextInt(),sc.nextInt());
        Print.pointsFormAqrResult(Helper.doPointsFormSqr(p1,p2,p3,p4));
    }
}
