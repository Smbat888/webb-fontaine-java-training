package collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> barer = new LinkedList<>();
        barer.add("text");
        barer.add("a");
        barer.add("b");


        Iterator iterator = barer.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    }
