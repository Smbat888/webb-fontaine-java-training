package collections.list.linkedlist;

import java.util.LinkedList;

public class AppendElement {
    public static void main(String[] args) {
        LinkedList<String> barer = new LinkedList<>();
        barer.add("text");
        barer.add("a");
        barer.add("b");

        System.out.println(addElement("Hamo", barer));
    }

    public static LinkedList<String> addElement(String element, LinkedList<String> barer) {
        barer.add(element);
        return barer;
    }
}
