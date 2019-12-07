package Week3;

public class W3HW2 {
    public static void main(String[] args) {


        String array[] = {"A", "BB", "CCC"};
        int length = array.length;


        for (int i = 0; i < length; i++) {

            System.out.println(String.format("[%s%s%s]", array[i], array[i], array[i]));
        }
    }
}