package collections.list.linkedlist;

import java.util.LinkedList;

public class InsertElementByIndex {
    public static void main(String[] args) {
        LinkedList<String> string = new LinkedList<>();
        string.add("a");
        string.add("b");
        string.add("c");
        string.add("d");
        string.add("e");

        System.out.println(addElementByIndex(5,"aaaaaa", string));

    }

    public static LinkedList<String> addElementByIndex(int index, String element, LinkedList<String> barer) {
        barer.add(index, element);
        return barer;
    }
}
