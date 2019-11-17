package classwork.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class ToDoListApi {

    private ToDoListApi() {
    }

    public static Task[] getUnassignedTasks(Task[] tasks) {
        int j = 0;
        Task[] unassagniedTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().name.equals(Constants.UNASSIGNED)) {
                unassagniedTasks[j++] = tasks[i];
            }
        }
        return Utils.objectWithoutNull(unassagniedTasks);
    }


}
