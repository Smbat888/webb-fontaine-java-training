package classwork2.todolist;

public class Unassigned extends Engineer {

    private static Unassigned instance;

    public Unassigned () {
        this.name = "Unassigned";
    }

    public static Unassigned getInstance() {
        if (instance == null) {
            instance = new Unassigned();
        }
        return instance;
    }
}
