package collections.list.linkedlist;

import java.util.LinkedList;

public class IsExists {
    public static void main(String[] args) {
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(1);
linkedList.add(3);
linkedList.add(5);
linkedList.add(7);
linkedList.add(9);

        System.out.println(isExists(5,linkedList));
    }

    static boolean isExists(int number, LinkedList<Integer> linkedList) {
        return linkedList.contains(number);
    }
}

