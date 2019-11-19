package Week4.Point_And_Line;

public class Print {

    public static void printPoint(Point point) {
        if (point != null) {
            System.out.println(point);
        }
    }

    public static void pointOnLineResult(boolean result) {
        if (result) {
            System.out.println(Constants.pointOnLine);
        } else {
            System.out.println(Constants.pointNotOnLine);
        }
    }

    public static void pointIsInAreaResult(boolean result) {
        if (result) {
            System.out.println(Constants.pointInArea);
        } else {
            System.out.println(Constants.pointNotInArea);
        }
    }
    public static void pointsFormAqrResult(boolean result) {
        if (result) {
            System.out.println(Constants.PointsFormSqr);
        } else {
            System.out.println(Constants.PointsDoNotFormSqr);
        }
    }
}
