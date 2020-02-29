package collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertToArrayList {
    public static void main(String[] args) {
        System.out.println(linkedListToArrayList());
    }

    static ArrayList<Integer> linkedListToArrayList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        ArrayList<Integer> arrayList = new ArrayList<Integer>(linkedList);
        return arrayList;
    }
}
