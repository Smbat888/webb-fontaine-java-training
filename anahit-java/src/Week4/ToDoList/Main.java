package classworkpackage.todolist;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (Engineer e : EngineerRepo.get()){
            System.out.println("e = " + e);
        }

        System.out.println();
        for (Task task : ToDoListAPI.getUnassignedTasks(TaskRepo.get())){
            System.out.println(task);
        }
        System.out.println(Arrays.toString(ToDoListAPI.getTasksByStatus(TaskRepo.get(), Status.DONE)));
        System.out.println(Arrays.toString(ToDoListAPI.getTasksByPriority(TaskRepo.get(), Priority.LOW)));
        System.out.println(Arrays.toString(ToDoListAPI.getTasksByDueDate(TaskRepo.get(), LocalDate.of(2019,11,30))));
        System.out.println(Arrays.toString(ToDoListAPI.getTasksByEngineer(TaskRepo.get(), EngineerRepo.get()[1])));

    }


}
