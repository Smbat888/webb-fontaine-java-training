package ClassWork.todolist;

public class EngineerRepo {

    private static Engineer[] engineers = new Engineer[6];

    static {
        System.out.println("engineers initialization");
        engineers[0] = new Engineer("Gohar", Role.QA);
        engineers[1] = new Engineer("Ruzan", Role.QA);
        engineers[2] = new Engineer("Mko", Role.DEV_OPS);
        engineers[3] = new Engineer("Kiloyan", Role.PM);
        engineers[4] = new Engineer("Lina", Role.DEVELOPER);
        engineers[5] = new Engineer("Meline", Role.DEV_OPS);
    }

    private EngineerRepo() {
        //empty private require constructor for avoiding new instance creation
    }

    public static Engineer[] get() {
        return engineers;
    }

}
