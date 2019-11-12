package week4.experiments.person;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Main {


    public static void main(String[] args) {
        Helper h = new Helper();
        Person person = new Person("aaa");
        h.change(person);
        System.out.println(person.name);
    }
}
