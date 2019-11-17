package classwork.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Utils {
    private Utils() {
    }

    public static Task[] objectWithoutNull(Task[] tasks) {

        int lenght = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != (null)) {
                lenght++;
            }
        }
        Task[] objectWithoutNull = new Task[lenght];
        for (int i = 0; i < tasks.length; i++) {
            int j = 0;
            for (Task o : tasks
            ) {
                if (o != null) {
                    objectWithoutNull[j++] = o;
                }
            }
        }
        return objectWithoutNull;
    }
}
