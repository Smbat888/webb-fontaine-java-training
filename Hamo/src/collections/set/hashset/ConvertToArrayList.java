package collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertToArrayList {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();


        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        ArrayList<String> arrrayList = new ArrayList<>(hashSet);

        System.out.println(arrrayList);
    }
}

