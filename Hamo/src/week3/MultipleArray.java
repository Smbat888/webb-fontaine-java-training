package week3;

/**
 * Createb BY Hmayak Atayan on Oct
 */
public class MultipleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        multipleByTwo(arr);
    }

    public static void multipleByTwo(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            newArr[i] = arr[i] * 2;
            System.out.println(newArr[i]);
        }
    }
}

