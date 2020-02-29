package collections.set.hashset;

import java.util.HashSet;

public class GetNumberOfElements {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);


        System.out.println(hashSet.size());
    }
}
