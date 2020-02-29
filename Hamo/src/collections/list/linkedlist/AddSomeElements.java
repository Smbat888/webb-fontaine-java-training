package collections.list.linkedlist;

import java.util.LinkedList;

public class AddSomeElements {
    public static void main(String[] args) {
        LinkedList<String> string = new LinkedList<>();
        string.add("a");
        string.add("b");
        string.add("c");
        string.add("d");
        string.add("e");

        System.out.println(addElementByIndex(5, "aaaaaa", "bbbbbbbbb", "ccc", string));

    }

    public static LinkedList<String> addElementByIndex(int index, String element, String element2, String element3, LinkedList<String> barer) {
        barer.add(index, element);
        barer.add(element2);
        barer.add(element3);
        return barer;
    }
}


