package classwork.todolist;


public class Utils {
    private Utils() {
    }

    public static Task[] removeNullObjects(Task[] objects) {
        int newLength = 0;
        for (Object o : objects) {
            if (o != null)
                newLength++;
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
}
