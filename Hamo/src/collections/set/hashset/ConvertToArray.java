package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ConvertToArray {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        for (String string : converterToArray(hashSet)) {
            System.out.println(string);
        }
    }

    public static String[] converterToArray(HashSet<String> hashSet) {
        Iterator<String> iterator = hashSet.iterator();
        String[] array = new String[hashSet.size()];
        int i = 0;
        while (iterator.hasNext()) {
            array[i] = iterator.next();
            ++i;
        }
        return array;
    }
}
