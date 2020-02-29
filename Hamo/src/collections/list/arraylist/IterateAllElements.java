package collections.list.arraylist;

import java.util.ArrayList;

public class IterateAllElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        for (int i : arrayList1) {
            System.out.println(i);
        }
    }

}
