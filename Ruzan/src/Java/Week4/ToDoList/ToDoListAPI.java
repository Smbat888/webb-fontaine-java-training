package Java.Week4.ToDoList;

public class ToDoListAPI {

    private ToDoListAPI() {

    }

    public static Task[] getUnassignedTasks(Task[] tasks) {
       int j =0;
        Task[] unassignedTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks [i].getAssignee().name.equals(Constants.UNASSIGNED)){
            unassignedTasks[j++] =tasks [i];
            }
        }

        unassignedTasks  = Utils.removeNullObjects(unassignedTasks);
        return unassignedTasks;
    }
    //to do list for homework
    //avelacnel dataner@
    //get anel taser@ by status
    //get tasks by priority / argument enum
    //get tass by due date
    //have a method to delete done tasks from array
    //get tasks by engineer

}