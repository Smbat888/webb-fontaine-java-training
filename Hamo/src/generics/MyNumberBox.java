package generics;

public class MyNumberBox<T extends Number> {

    private T[] array;

    public void printArray() {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public double sum() {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum;

    }

    public MyNumberBox(T[] array) {
        this.array = array;
    }
}
