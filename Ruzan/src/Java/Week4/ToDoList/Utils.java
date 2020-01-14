package Java.Week4.ToDoList;

public class Utils {

    private Utils() {

    }

    public static Task [] removeNullObjects(Task[] objects) {
        int newLength = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects [i] != null)
                newLength++;
        }
        int j=0;
        Task [] objectsWithoutNull = new  Task[newLength];
        for (int i = 0; i < objects.length; ++i) {
            if (objects [i] !=null)
                objectsWithoutNull [j++] = objects [i];

        }
        return objectsWithoutNull;
    }
}
