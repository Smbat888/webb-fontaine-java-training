package generics;

public class Havayi {
    public static void main(String[] args) {
        Double[] numers = {1.5,1.8,2.8,5.6};
        MyNumberBox myNumberBox = new MyNumberBox(numers);
        System.out.println(myNumberBox.sum());
    }
}
