package oop.week3;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Գրել ֆունկցիա, որը տրված String-nերի զանգվածից կջնջի այն էլեմենտները որոնց երկարությունը մեծ են փոխանցվող թվից եւ կվերադարձնի նոր ստացված զանգվածը;
 * Օրինակ՝ ( 4-ի դեպքում) noLong(["this", "not", "too", "long"]) → ["not", "too"]
 */
public class RemoveElement {
    static String[] a = {"this", "not", "too", "long"};

    public static void main(String[] args) {
        for (String s : noLongerThanMAxLenght(a, 4)
        ) {
            System.out.println(s);

        }
    }

    public static String[] noLongerThanMAxLenght(String[] array, int maxLength) {
        int index = 0;
        String[] filteredMatrix = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < maxLength) {
                filteredMatrix[index] = array[i];
                ++index;
            }
        }
        String[] lastMatrix = new String[index];
        for (int i = 0; i < index; i++) {
            lastMatrix[i] = filteredMatrix[i];
        }
        return lastMatrix;
    }
}
