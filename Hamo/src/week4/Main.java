package week4;

import week4.tooyn.UserType;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Main {
    public static void main(String[] args) {

//        Singltone a = Singltone.getInstance();
//        Singltone b = Singltone.getInstance();
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        for (UserType userType : UserType.values()) {
            System.out.println(userType.getPriority());
        }
        System.out.println(UserType.valueOf("ADMIN"));

    }
}
