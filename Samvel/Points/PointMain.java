package Points;

public class PointMain {

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setPoint(9,24);
        Point point2 = new Point();
        point2.setPoint(2, 7);
        Line line = new Line();
        line.calculateDistance(point1, point2);
    }
}
