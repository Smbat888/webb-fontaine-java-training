package Java.Week4.ToDoList;

public class Unassigned extends Engineer {

    private static Unassigned instance;

    private Unassigned (){
        this.name = "Unassigned";

    }
    public static Unassigned getInstance(){
        if (instance==null){
            instance = new Unassigned();
        }
        return instance;
    }
}
