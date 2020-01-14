package Java.Week1;

public class AvarageOf10 {
    public static void main(String[] args) {

        double avg;
        double sum=0;


        double array[] = {1, 5.5, 8, 3, 11, 49, 85, 132, 0, 7};

        for (int i = 0; i < array.length; ++i) {

            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println("The average of array: " + avg);

    }
}