package collections.list.arraylist;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);

    }

}

