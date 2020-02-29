package generics;

public class BoxTest {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.set("box name");
        String name = box.get();

        System.out.println("name = " + name);

        Box<Integer> box1 = new Box<>();
        box1.set(47);
        int y = box1.get();
        System.out.println("y = " + y);
    }
}
