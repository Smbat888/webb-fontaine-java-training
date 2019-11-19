package ClassWork.todolist;

public class ToDoListAPI {

    private ToDoListAPI() {

    }

    public static Task[] getUnassignedTasks(Task[] tasks) {
        Task[] unassignedTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().name.equals(Constants.UNASSIGNED)) {
                unassignedTasks[i] = tasks[i];

            }
        }
        return unassignedTasks;

    }
}
