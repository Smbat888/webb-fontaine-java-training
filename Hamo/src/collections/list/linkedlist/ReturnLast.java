package collections.list.linkedlist;

import java.util.LinkedList;

public class ReturnLast {
    public static void main(String[] args) {
        System.out.println(getLastElement());
    }

    static int getLastElement(){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        return numbers.get(numbers.getLast()-1);
    }
}
