package Additional;

public class StringReverse {
    public static void main(String[] args) {
        String a = "abc";
        reverse (a);
    }
    public static void reverse(String a) {
        char[] arr = new char[a.length()];
        int y = 0;
        for (int i=a.length()-1; i>=0; i--) {
            arr[y] = a.charAt(i);
            y++;
        }
        System.out.println(arr);
    }
}
