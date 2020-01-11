package Week3;

public class N1_DoubleArray {
    public static void main(String[] args) {
        double[] numbers = {-1, 21.1, 3, 7, 9};
        doubler(numbers);
    }

    public static void doubler(double[] numbers) {
        for(double i: numbers) {
            System.out.println(i*2);
        }
    }
}