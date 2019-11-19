package ClassWork.todolist;

public class Main {

    public static void main(String[] args) {
//        for (Engineer e: EngineerRepo.get()) {
//            System.out.println("e = " + e);
//        }
//        for (Task t: TaskRepo.get()){
//            System.out.println("t = " + t);
//        }
        for (Task task: ToDoListAPI.getUnassignedTasks(TaskRepo.get())){
            System.out.println("task = " + task);
        }

    }
}
