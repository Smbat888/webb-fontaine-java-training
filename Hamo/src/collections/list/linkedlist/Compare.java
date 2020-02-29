package collections.list.linkedlist;

import java.util.LinkedList;

public class Compare {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);

        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        System.out.println(isEqual(linkedList1, linkedList2));

    }

    public static boolean isEqual(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {


        return linkedList1.equals(linkedList2);
    }

}
