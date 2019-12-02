package Week3;
public class N8_Recursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(multiple(n));
    }
    public static int multiple(int n) {
        return multiple(n)*multiple(n-1);
    }
}