package Execises;

public class MySingleTonMain {
    public static void main(String[] args) {
        MySingleTon a = MySingleTon.getInstance();
        MySingleTon a2 = MySingleTon.getInstance();
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
    }
}
