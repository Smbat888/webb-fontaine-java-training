package classwork.todolist;

public class EngineerRepo {

    private static Engineer[] engineers = new Engineer[6];

    static {
        System.out.println("engineers initialization");
        engineers[0] = new Engineer("Lilia", Role.QA);
        engineers[1] = new Engineer("Aurora", Role.QA);
        engineers[2] = new Engineer("Alex", Role.DEVELOPER);
        engineers[3] = new Engineer("Rob", Role.DEV_OPS);
        engineers[4] = new Engineer("Sarah", Role.PM);
        engineers[5] = new Engineer("Gary", Role.DEVELOPER);
    }

    private EngineerRepo() {
    }

    public static Engineer[] get() {
        return engineers;
    }

}
