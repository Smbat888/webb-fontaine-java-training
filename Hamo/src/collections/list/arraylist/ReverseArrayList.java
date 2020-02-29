package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        Collections.reverse(arrayList1);
        System.out.println(arrayList1);

    }

}
