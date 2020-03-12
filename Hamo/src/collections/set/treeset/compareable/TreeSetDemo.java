package collections.set.treeset.compareable;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<ComperablePerson> personTreeSet = new TreeSet<>();
        personTreeSet.add(new ComperablePerson("Hamo", 27, 110.5F));
        personTreeSet.add(new ComperablePerson("Smbat", 25, 70.00F));
        personTreeSet.add(new ComperablePerson("Arshak", 30, 11.5F));
        personTreeSet.add(new ComperablePerson("Zori", 31, 10.5F));

        System.out.println(personTreeSet);

        TreeSet<Dog> dogs = new TreeSet<>((o1, o2) -> {
            if (o1.age > o2.age) {
                return 1;
            } else if (o1.age < o2.age) {
                return -1;
            } else return 0;
        });

        dogs.add(new Dog(7, "Graf"));
        dogs.add(new Dog(4, "Hafo"));
        dogs.add(new Dog(9, "Shun"));

        System.out.println(dogs);
    }
}
