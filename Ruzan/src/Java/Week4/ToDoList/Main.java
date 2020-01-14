package Java.Week4.ToDoList;

public class Main {

    public static void main(String[] args) {
        for (Engineer e : EngineerRepo.get()) {
            System.out.println("Engineer : " + e);
        }

        for (Task t : TaskRepo.get()) {
            System.out.println("Tasks : " + t);

            for (Task task : ToDoListAPI.getUnassignedTasks(TaskRepo.get())) {
                System.out.println("task = " + task);

            }
        }
    }
}
