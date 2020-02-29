package conditions1;

public class ShapeArea {
    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }

    static int shapeArea(int n) {
        if (n == 1) {
            return n;
        }
        return shapeArea((n - 1) + (4 * (n - 1)));
    }
}
