package week4.experiments.person;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Helper {
    public void change(int i ){
        i++;
    }

    public void change(Person p ){
        p = new Person("ccc");
        p.setName("testik");
    }

}
