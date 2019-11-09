package Week2;



public class EX6_SortArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("Element " + "[ " + i + " ]= " + array[i]);
        }
        System.out.println("Ascending sorted: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + "[ " + i + " ]= " + array[i]);
        }
        System.out.println("Descending sorted: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + "[ " + i + " ]= " + array[i]);
        }
    }
}
