package conditions1.experiments;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Arrays {
    static int[][] array = {{1, 7}, {2, 3, 9}};

    public static void main(String[] args) {
        minPlusMax();
    }

    static public void minPlusMax() {
        int max = 5;
        int min = 5;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[i].length; ++j) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max + min);
    }
}
