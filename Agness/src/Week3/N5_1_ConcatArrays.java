package Week3;
import java.util.Scanner;

class N5_1_ConcatArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = new String[3];
        String[] array2 = new String[3];
        for (int x = 0; x < array1.length; x++){
            System.out.println("Please enter something: ");
            array1[x] = scanner.next();
        }
        for (int y = 0; y < array2.length; y++){
            System.out.println("Please enter something: ");
            array2[y] = scanner.next();
        }
        concat(array1, array2);
    }
    private static void concat(String[] array1, String[] array2) {
        String[] array3 = new String[array1.length + array2.length];
        int k=0;
        for (int i=0; i<=array1.length-1; i++) {
            array3[k] = array1[i];
            System.out.print(array3[k]);
            k++;
        }
        int h=array1.length;
        for (int j=0; j<=array2.length-1; j++) {
            array3[h] = array2[j];
            System.out.print(array3[h]);
            h++;
        }
    }
}