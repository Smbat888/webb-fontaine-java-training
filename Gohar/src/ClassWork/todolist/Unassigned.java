package ClassWork.todolist;

public class Unassigned extends Engineer {
    private static Unassigned instance;


    private Unassigned(){
        this.name = Constants.UNASSIGNED;
    }
    public static Unassigned getInstance() {
        if (instance == null) {
            instance = new Unassigned();
        }
        return instance;
    }
}
