package week5;

import java.io.Serializable;

/**
 * Created by: Hmayak Atayan on 21 December, 2019
 */
public class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%d , %s, ", age, name);
    }


}
