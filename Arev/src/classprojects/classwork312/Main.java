package classprojects.classwork312;

public class Main {
    public static void main(String[] args) {
        Singleton s =Singleton.getInstance("ative");
        s.foo();
        NestedSingleton.getInstance();
        NestedSingleton.getInstance();
        NestedSingleton.getInstance();
        NestedSingleton.getInstance();
//
//        Person.Job job = new Person.Job();

         Person.Job.workingHours();
    }
}
