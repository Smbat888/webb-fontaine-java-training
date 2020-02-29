package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 3, 2, 4, 9, 5, 6};
        int temp;
        for (int alreadySorted = 0; alreadySorted < numbers.length - 1; alreadySorted++) {
            for (int j = 0; j < numbers.length - 1 - alreadySorted; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int n : numbers
        ) {
            System.out.print(n + " ");

        }
    }

}
