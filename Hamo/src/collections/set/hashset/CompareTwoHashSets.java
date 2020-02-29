package collections.set.hashset;

import java.util.HashSet;

public class CompareTwoHashSets {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        HashSet<String> hashSet2 = new HashSet<>(hashSet);

        System.out.println(hashSet2.equals(hashSet));
    }
}

