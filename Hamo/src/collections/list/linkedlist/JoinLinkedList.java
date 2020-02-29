package collections.list.linkedlist;

import java.util.LinkedList;

public class JoinLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        LinkedList <Integer> numbers2 = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);

        numbers.addAll(numbers2);
        System.out.println(numbers);
    }
}
