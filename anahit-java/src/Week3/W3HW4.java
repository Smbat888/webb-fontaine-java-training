package Week3;

public class W3HW4 {
    public static void main(String[] args) {

        String[] array = {"12345", "123456", "1234567", "12345678"};
        String[] array2 = new String[array.length];




        for (int i = 0; i < array.length; i++)

            if (array[i].length() >6) {

                array2[i] = array[i];
                System.out.println(String.format("[%s]", array2[i]));
            }

    }
}
