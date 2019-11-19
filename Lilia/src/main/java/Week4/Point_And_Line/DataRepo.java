package Week4.Point_And_Line;

public class DataRepo {

    private static Point[] points = new Point[6];

    static {
        points[0] = new Point(2, 4);
        points[1] = new Point(7, 2);
        points[2] = new Point(4, 4);
        points[3] = new Point(5, 4);
        points[4] = new Point(5, 3);
        points[5] = new Point(3, 2);
    }

    public static Point[] get() {
        return points;
    }
    public static int sameYPointsLength (Point[]points, Point point1){
        int length=0;
        for (int i = 0; i < points.length; i++) {
            if (point1.getY() == points[i].getY()) {
               length++;
            }
        }
        return length;

    }

        public static Point[] sameYPoints (Point[]points, Point point1){
            Point sameYPoints[] = new Point[sameYPointsLength(points,point1)];
            int j=0;
            for (int i = 0; i < points.length; i++) {
                if (point1.getY() == points[i].getY()) {
                    sameYPoints[j++] = points[i];
                }
            }
            return sameYPoints;
        }
    }
