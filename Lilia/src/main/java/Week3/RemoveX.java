package Week3;

public class RemoveX {
    public static void main(String[] args) {
        String arrX[] = {"ax", "axbx", "bxxcxx", "xxxxx"};
        String arrNoX[] = new String[arrX.length];
        for (int i = 0; i < arrX.length; i++) {
            arrNoX[i] = arrX[i].replaceAll("x", "");
            System.out.println(String.format("[%s]", arrNoX[i]));
        }
    }
}
