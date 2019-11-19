package classwork.todolist;

public class Print {
    public static void arrayPrint(Object[] array) {
        if (array != null)
            for (Object object : array) {
                System.out.println(object);
            }
    }
}
