package classwork2.todolist;

public class Utils {
    private Utils() {

    }

    public static Task[] removeNullObjects(Task[] objects) {
        int newLength = 0;
        for (Task o : objects) {
            if (o != null) {
                newLength++;
            }
        }

        Task[] objectsWithoutNull = new Task[newLength];
        int j = 0;
        for (Task object : objects) {
            if (object != null) {
                objectsWithoutNull[j++] = object;
            }
        }
        return objectsWithoutNull;
    }

    public static Task[] removeTasksByStatus (Enum status) {
        int newLength = 0;
        Task[] allTasks = TaskRepo.get();
        for (Task t : allTasks) {
            if (!t.getStatus().equals(status)) {
                newLength++;
            }
        }

        Task[] tasksWithoutDone = new Task[newLength];
        int j=0;
        for (Task t : tasksWithoutDone) {
            if (!t.getStatus().equals(status)) {
                tasksWithoutDone[j++] = t;
            }
        }
        return tasksWithoutDone;
    }
}
