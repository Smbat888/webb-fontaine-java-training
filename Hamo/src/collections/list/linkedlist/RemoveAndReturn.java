package collections.list.linkedlist;

import java.util.LinkedList;

public class RemoveAndReturn {


    public static void main(String[] args) {
        System.out.println(removeAndReturnFirst());
    }

    static int removeAndReturnFirst(){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(0);
        return numbers.get(0);
    }
}
