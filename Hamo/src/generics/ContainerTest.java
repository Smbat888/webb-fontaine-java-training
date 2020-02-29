package generics;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String, Integer> container = new Container<>();
        container.setName("myContainer");
        container.setValue(27);

        System.out.println(container);

        Container<String, Double> container1 = new Container<>();
        container1.setName("myContainer-1");
        container1.setValue(22.8);
        System.out.println(container1);

        Container<Integer, Box<String>> container2 = new Container<>();
        Box<String> box = new Box<>();
        box.set("AAAA");
        container2.setName(34);
        container2.setValue(box);
        System.out.println(container2);
    }
}
