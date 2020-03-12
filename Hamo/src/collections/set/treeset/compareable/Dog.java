package collections.set.treeset.compareable;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return String.format("%d , %s", age, name);
    }
}
