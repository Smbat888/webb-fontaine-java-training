package week3;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Գրել ֆունկցիա, որը տրված զանգվածի տրված ինդեքսի արժեքը կմեծացնի 10% -ով.
 */
public class AddIndexByTenPercent {
    static double[] ttt = {23.5, 100, 200, 510};

    public static void main(String[] args) {
        for (double d : increaseIndexBy10Percent(ttt, 0)
        ) {
            System.out.println(d);

        }
    }

    public static double[] increaseIndexBy10Percent(double[] arr, int index) {
        double[] increasedArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                increasedArray[i] = arr[i] * 1.10;
                continue;
            }
            increasedArray[i] = arr[i];
        }
        return increasedArray;
    }

}
