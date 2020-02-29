package collections.list.linkedlist;

import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {

        /*todo remember
         * Each linkedList has previous and next
         * First element of the LinkedList calls Head
         * Last element of the LinkedList calls Tail
         */
        LinkedList<Integer> tver = new LinkedList<>();
        tver.add(1);
        tver.add(1);
        tver.add(1);
        tver.add(1);

        System.out.println(tver.size());

    }
}
