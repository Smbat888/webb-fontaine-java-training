package classwork2.todolist;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        for (Engineer e : EngineerRepo.get()) {
            System.out.println("e = " + e);
        }

        for (Task t : TaskRepo.get()) {
            System.out.println("t = " + t);
        }

        for (Task task : ToDoListAPI.getUnassignedTasks(TaskRepo.get())) {
            System.out.println("task = " + task);
        }

        for (Task task : ToDoListAPI.getTasksByStatus(Status.DONE)) {
            System.out.println("task = " + task);
        }

        for (Task task : ToDoListAPI.getTasksByStatus(Priority.HIGH)) {
            System.out.println("task = " + task);
        }

        for (Task task : ToDoListAPI.getTasksDueDate(LocalDate.now())) {
            System.out.println("task = " + task);
        }


    }
}
