package ToDoList;
public class Main_12 {
    public static void main(String[] args) {

        for (Task_1 task: ToDoListAPI_10.getUnassignedTasks(TaskRepo_9.get())){
            System.out.println(task);
        }

        for (Task_1 task : ToDoListAPI_10.getTaskByStatus(TaskRepo_9.get(), Status_3.TODO)) {
            System.out.println(task.getStatus());
        }
        for (Task_1 task : ToDoListAPI_10.getTaskByStatus(TaskRepo_9.get(), Status_3.DONE)) {
            System.out.println(task.getStatus());
        }

        for (Task_1 task : ToDoListAPI_10.getTaskByPriority(TaskRepo_9.get(), Priority_2.HIGH)) {
            System.out.println(task.getPriority());
        }

        for (Task_1 task : ToDoListAPI_10.getTaskByDueDate(TaskRepo_9.get(), "2019-12-31")) {
            System.out.println(task.getDueDate());
        }

        for (Task_1 task : ToDoListAPI_10.deleteDoneTasks(TaskRepo_9.get())) {
            System.out.println(task);
        }

        for (Task_1 task : ToDoListAPI_10.getTasksForEngineers(TaskRepo_9.get())) {
            System.out.println(task);
        }
    }
}