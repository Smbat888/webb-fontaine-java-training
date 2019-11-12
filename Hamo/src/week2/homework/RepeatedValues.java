package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class RepeatedValues {
    static int arrayFirst[] = {1, 45, 6, 32};
    static int arraySecond[] = {3, 4, 45, 71, 1};

    public static void main(String[] args) {
        for (int arr1 : arrayFirst
        ) {
            for (int arr2 : arraySecond
            ) {
                if (arr1 == arr2) {
                    System.out.println(arr1);
                }
            }
        }
    }
}
