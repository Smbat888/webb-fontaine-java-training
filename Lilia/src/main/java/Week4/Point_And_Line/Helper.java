package Week4.Point_And_Line;

public class Helper {
    private Helper() {
    }

    public static Point point() {
        Point point = new Point(((int)(Math.random() * 10)), (int)(Math.random() * 10));
        return point;
    }

    public static double distanceBetweenTwoPoints(Point point1, Point point2) {
        double distance = Math.sqrt((point2.getY() - point1.getY()) * (point2.getY() - point1.getY()) + (point2.getX() - point1.getX()) * (point2.getX() - point1.getX()));
        return distance;
    }

    public static Point middlePoint(Point point1, Point point2) {
        //   Point middlePoint = new Point(((point1.getX() + point2.getX()) / 2), ((point1.getY() + point2.getY()) / 2));
        Point middlePoint = new Point();
        middlePoint.setX((point1.getX() + point2.getX()) / 2);
        middlePoint.setY((point1.getY() + point2.getY()) / 2);
        return middlePoint;
    }

    public static boolean isPointOnLine(Point point1, Point point2, Point givenPoint) {
        Line line = new Line(point1, point2);
        return line.isPointOnLine(givenPoint);
    }

    public static boolean isPointInArea(Point[] sameYPoints, Point point1) {
        int count = 0;
        int inf = 1000;
        for (int i = 0; i < inf; i++) {
            for (int j = 0; j < sameYPoints.length; j++) {
                point1.setX(point1.getX() + 1);
                if (sameYPoints[j].equals(point1)) {
                    count++;
                }
            }
        }
        if (count % 2 != 0) {
            return true;
        }
        return false;
    }
    public static boolean doPointsFormSqr(Point point1,Point point2,Point point3,Point point4){
        double p1p2=distanceBetweenTwoPoints(point1,point2);
        double p2p3=distanceBetweenTwoPoints(point2,point3);
        double p3p4=distanceBetweenTwoPoints(point3,point4);
        double p4p1=distanceBetweenTwoPoints(point4,point1);
        if (equals(p1p2,p2p3) && equals(p3p4,p4p1)){
            double p1p3=distanceBetweenTwoPoints(point1,point3);
            double p2p4=distanceBetweenTwoPoints(point2,point4);
            return equals((p1p3)*(p1p3),(p1p2)*(p1p2)+(p2p3)*(p2p3)) && equals((p2p4)*(p2p4),(p3p4)*(p3p4)+(p4p1)*(p4p1));
            }
        return false;
        }

        public static boolean equals(double a,double b){
            return Math.abs(b - a) < 0.03;
        }
}
