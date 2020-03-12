package collections.set.treeset.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Hmayak Atayan on  11, Mar, 2020
 */
public class TreeSetDemo {


    TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() { //can be done with lambdas
        @Override
        public int compare(Person p1, Person p2) {
            if (p1.getAge() > p2.getAge()) {
                return 1;
            } else if (p1.getAge() == p2.getAge()) {
                return 0;
            } else return 0;
        }
    });


}
