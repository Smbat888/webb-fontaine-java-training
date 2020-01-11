package Points;

public class PointsAPI {

    public static Point middlePointCoordinates(Point point1, Point point2) {
        double middleX = Math.abs(point1.getxCoordinate() - point2.getxCoordinate())/2;
        double middleY = Math.abs(point1.getyCoordinate() - point2.getyCoordinate())/2;
        Point middlePoint = new Point();
        middlePoint.setPoint(middleX, middleY);
        return middlePoint;
    }

    public static boolean isGivenPointBelongsToArea(Point point) {

        return true;
    }
}
