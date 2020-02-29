package collections.list.linkedlist;

import java.util.LinkedList;

public class DeleteLastAndFirst {
    public static void main(String[] args) {
        LinkedList<Integer> tver = new LinkedList<>();
        tver.add(1);
        tver.add(2);
        tver.add(3);
        tver.add(4);
        tver.add(5);

        tver.remove(tver.size() -1 );
        tver.remove(0);

        System.out.println(tver);
    }
}
