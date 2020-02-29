package collections.list.arraylist;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        System.out.println(removeElementByIndex(3, arrayList1));
    }

    public static ArrayList<Integer> removeElementByIndex(int index, ArrayList<Integer> tver) {
        tver.remove(index);
        return tver;
    }
}
