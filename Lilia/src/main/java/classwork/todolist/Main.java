package classwork.todolist;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unassigned tasks: ");
        Print.arrayPrint(ToDoListAPI.getUnassignedTasks(TaskRepo.get()));
        System.out.println("------------------------");
        System.out.println("Tasks by status: ");
        Print.arrayPrint(ToDoListAPI.getTasksByStatus(TaskRepo.get(), Status.DONE));
        System.out.println("------------------------");
        System.out.println("Tasks by priority: ");
        Print.arrayPrint(ToDoListAPI.getTasksByPriority(TaskRepo.get(), Priority.LOW));
        System.out.println("------------------------");
        System.out.println("Enter Due date:(YYYY-MM-DD)");
        Print.arrayPrint(ToDoListAPI.getTasksByDueDate(TaskRepo.get(), LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt())));
        System.out.println("------------------------");
        System.out.println("Tasks by engineer: ");
        Print.arrayPrint(ToDoListAPI.getTasksByEngineer(TaskRepo.get(), EngineerRepo.get()[1]));
        System.out.println("------------------------");
        System.out.println("Tasks without done status: ");
        Print.arrayPrint(ToDoListAPI.deleteDoneTasks(TaskRepo.get()));
        System.out.println("------------------------");
        Print.arrayPrint(ToDoListAPI.changeStatusToDone(TaskRepo.get()));
        System.out.println("------------------------");
        Print.arrayPrint(ToDoListAPI.changeEngineer(TaskRepo.get()));
        System.out.println("------------------------");
        Print.arrayPrint(ToDoListAPI.changeEngineerName(TaskRepo.get()));
    }
}
