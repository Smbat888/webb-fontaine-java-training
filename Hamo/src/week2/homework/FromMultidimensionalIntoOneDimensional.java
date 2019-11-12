package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class FromMultidimensionalIntoOneDimensional {
    public static void main(String[] args) {
        transfer();
    }

    static int multidimenssional[][] = {{1, 2, 5, 8, 5}, {4, 8, 9, 5, 6}};

    public static void transfer() {
        int newTemp = 0;
        int transferedArray[] = new int[multidimenssional[0].length + multidimenssional[1].length];
        for (int i = 0; i < multidimenssional[0].length; i++) {
            for (int j = 0; j < multidimenssional[0].length; j++) {
                int tempo = multidimenssional[0].length + multidimenssional[1].length;
                if (newTemp < tempo) {
                    transferedArray[newTemp] = multidimenssional[i][j];
                    System.out.print(transferedArray[newTemp]);
                    System.out.print(" ");
                    ++newTemp;
                }
            }
        }

    }
}
