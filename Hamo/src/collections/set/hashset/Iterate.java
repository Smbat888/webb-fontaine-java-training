package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
//todo ask Smbat about ordering

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(3);

        System.out.println(hashSet);

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}