package arrays;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Sort {
    static int n[] = {1, 4, 8, 2, 9};

    public static void main(String[] args) {
        System.out.println("Displayed Increased array ");
        increase(n);
        showArray();
        System.out.println("\nDisplayed Decreased array ");
        decrease(n);
        showArray();
    }

    public static void decrease(int[] array) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void increase(int[] array) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void showArray() {
        for (int a : n
        ) {
            System.out.println(a);
        }
    }

}
