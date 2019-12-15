package classworkpackage.todolist;

public class EngineerRepo {

    private static Engineer[] engineers = new Engineer[6];

    static{
        System.out.println("engineers intialization");
        engineers[0]= new Engineer("Anahit", Role.QA);
        engineers[1]= new Engineer("Lilia", Role.PM);
        engineers[2]= new Engineer("Gohar", Role.DEV_OPS);
        engineers[3]= new Engineer("Vane", Role.QA);
        engineers[4]= new Engineer("Hamo", Role.DEVELOPER);
        engineers[5]= new Engineer("Ruzan", Role.PM);

    }

    private EngineerRepo(){
        //empty private constructor for avoiding new instance creation
    }
    public static Engineer[] get(){
        return engineers;
    }


}
