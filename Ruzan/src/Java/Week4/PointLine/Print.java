package Java.Week4.PointLine;

public class Print {
    public static void printPoint(Point point) {
        if (point != null) {
            System.out.println(point);
        }
    }

    public static void pointOnLineResult(boolean result) {
        if (result) {
            System.out.println(Static.pointOnLine);
        } else {
            System.out.println(Static.pointNotOnLine);
        }
    }

    public static void pointIsInAreaResult(boolean result) {
        if (result) {
            System.out.println(Static.pointInArea);
        } else {
            System.out.println(Static.pointNotInArea);
        }
    }
    public static void pointsFormAqrResult(boolean result) {
        if (result) {
            System.out.println(Static.PointsFormSqr);
        } else {
            System.out.println(Static.PointsDoNotFormSqr);
        }
    }
}

