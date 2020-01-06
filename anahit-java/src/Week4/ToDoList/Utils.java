package classworkpackage.todolist;

public class Utils {

    private Utils(){
    }

    public static Task[] removeNullObjects(Task[] tasks){
        int newlength=0;
        for (Task object: tasks){
            if(object != null){
                newlength++;

            }
        }
        Task[] objectswithoutnull=new Task[newlength];
        int j=0;
        for (Task object : tasks) {
            if (object != null) {
                objectswithoutnull[j++] = object;
            }
        }
        return objectswithoutnull;
    }
}
