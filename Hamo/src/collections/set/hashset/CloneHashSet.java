package collections.set.hashset;

import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
        HashSet <String> anotherHashSet = new HashSet<>();

        hashSet.add("text");
        hashSet.add("a");
        hashSet.add("f");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        anotherHashSet.addAll(hashSet);

        System.out.println(hashSet);
        System.out.println(anotherHashSet);

    }
}
