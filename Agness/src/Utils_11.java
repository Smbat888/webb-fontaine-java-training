public class Utils_11 {
    private Utils_11(){
    }
    public static Task_1[] removeNullObjects(Task_1[] objects){
        int newLength=0;
        for (Object o : objects) {
            if (o != null)
                newLength++;
        }
        Task_1[] objectsWithoutNull=new Task_1[newLength];
        int j=0;
        for (Task_1 object : objects) {
            if (object != null) {
                objectsWithoutNull[j++] = object;
            }
        }
        return objectsWithoutNull;
    }
}