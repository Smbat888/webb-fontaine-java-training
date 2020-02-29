package collections.list.linkedlist;

import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<Integer> tver = new LinkedList<>();
        tver.add(1);
        tver.add(2);
        tver.add(3);
        tver.add(4);
        tver.add(5);

        System.out.println(removeElement(3, tver));
    }

    public static LinkedList<Integer> removeElement(int element, LinkedList<Integer> linkList) {
        for (int i = 0; i < linkList.size(); i++) {
            if (element == linkList.get(i)) {
                linkList.remove(i);
            }
        }
        return linkList;
    }
}
