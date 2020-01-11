package Points;

public class Line {
    private double length;

    public double calculateDistance (Point point1, Point point2) {

        double x1 = point1.getxCoordinate();
        double x2 = point2.getxCoordinate();
        double y1 = point1.getyCoordinate();
        double y2 = point2.getyCoordinate();
        double xLength = Math.abs(x1 - x2);
        double yLength = Math.abs(y1 - y2);

        this.length = Math.pow(xLength, 2) + Math.pow(yLength, 2);
        return Math.sqrt(this.length);
    }
}
