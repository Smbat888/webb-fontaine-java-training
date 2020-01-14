package Java.Week4.ToDoList;

public class EngineerRepo {

    private static Engineer [] engineers = new Engineer[6];

    static {

        System.out.println(" engineers initialization" );
        engineers [0] = new Engineer("Ruzan",Role.QA);
        engineers [1] = new Engineer("Gohar",Role.QA);
        engineers [2] = new Engineer("Mona",Role.DEVELOPER);
        engineers [3] = new Engineer("Hayk", Role.PM);
        engineers [4] = new Engineer("Mko", Role.DEV_OPS);
        engineers [5] = new Engineer("Hasna", Role.DEVELOPER);
    }

    private EngineerRepo (){
        //empty constructor for EngineerRepo is to avoid new instance creation
    }

    public static Engineer[] get(){
        return engineers;
    }

}
