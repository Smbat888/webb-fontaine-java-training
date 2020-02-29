package collections.list.arraylist;

import java.util.ArrayList;

public class JoinArraysLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);


        System.out.println(joinArrayList(arrayList1, arrayList2));
    }

    public static ArrayList<Integer> joinArrayList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        arrayList1.addAll(arrayList2);
        return arrayList1;
    }
}
