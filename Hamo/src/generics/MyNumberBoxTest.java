package generics;

public class MyNumberBoxTest {
    public static void main(String[] args) {
        Double[] array = {4.5, 5.6, 7.0};
        MyNumberBox<Double> myNumberBox = new MyNumberBox<>(array);
        myNumberBox.printArray();
        System.out.println( myNumberBox.sum());

        Float[] array1 = {5.35f, 4.6f, 85.0f};
        MyNumberBox<Float> myNumberBoxFloat = new MyNumberBox<>(array1);
        myNumberBoxFloat.printArray();
        System.out.println( myNumberBoxFloat.sum());

    }
}
