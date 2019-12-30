package ClassWork.OOP.singltone;

public class Person {

    private String name;
    private int age;

    public static class Job {

        private String title;
        private double salary;

        static int workingHours() {
            return 5 * 8;
        }
    }

    //.........
}
