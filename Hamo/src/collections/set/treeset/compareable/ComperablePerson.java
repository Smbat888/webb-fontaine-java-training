package collections.set.treeset.compareable;

public class ComperablePerson implements Comparable<ComperablePerson> {
    public String name;
    public int age;
    public float weight;

    public ComperablePerson(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s %d %f", name, age, weight);
    }

    @Override
    public int compareTo(ComperablePerson person) {
        if (age > person.age) {
            return 1;
        } else if (age < person.age) {
            return -1;
        } else return 0;
    }
}
