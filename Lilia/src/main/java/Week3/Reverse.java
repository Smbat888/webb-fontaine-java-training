package Week3;

public class Reverse {
    public static void main(String[] args) {
        String x = "abc";
        System.out.println(reverse(x));
    }

    static String reverse(String x) {
        char[] array = new char[x.length()];
        int y = 0;
        for (int i = x.length() - 1; i >= 0; i--) {
            array[y] = x.charAt(i);
            y++;
        }
        String s = new String(array);
        return s ;
    }
}
