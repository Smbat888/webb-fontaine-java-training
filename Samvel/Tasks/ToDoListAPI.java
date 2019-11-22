package classwork2.todolist;

import javax.rmi.CORBA.Util;
import java.time.LocalDate;

public class ToDoListAPI {

    private ToDoListAPI() {

    }

    private static Task[] allTasks = TaskRepo.get();

    public static Task[] getUnassignedTasks(Task[] tasks) {
        Task[] unassignedTasks = new Task[tasks.length];
        for (int i=0; i<tasks.length; i++) {
            if(tasks[i].getAssignee().name.equals(Constants.UNASSIGNED)) {
                unassignedTasks[i] = tasks[i];
            }
        }

        unassignedTasks = Utils.removeNullObjects(unassignedTasks);
        return unassignedTasks;
    }

    //todo Get tasks by status

    public static Task[] getTasksByStatus(Enum status) {
        Task[] tasksMatchingStatus = new Task[allTasks.length];
        for (int i=0; i<allTasks.length; i++) {
            if (allTasks[i].getStatus().equals(Status.DONE)) {
                tasksMatchingStatus[i] = allTasks[i];
            }
        }
        tasksMatchingStatus = Utils.removeNullObjects(tasksMatchingStatus);
        return tasksMatchingStatus;
    }

    //todo Get tasks by priority

    public static Task[] getTasksByPriority (Enum priority) {
        Task[] tasksMatchingPriority = new Task[allTasks.length];
        for (int i=0; i<allTasks.length; i++) {
            if (allTasks[i].getStatus().equals(Priority.HIGH)) {
                tasksMatchingPriority[i] = allTasks[i];
            }
        }
        tasksMatchingPriority = Utils.removeNullObjects(tasksMatchingPriority);
        return tasksMatchingPriority;
    }

    //todo Get tasks by dueDate

    public static Task[] getTasksDueDate (LocalDate dueDate) {
        Task[] tasksMatchingDueDate = new Task[allTasks.length];
        for (int i=0; i<allTasks.length; i++) {
            if (allTasks[i].getDueDate().isAfter(dueDate)) {
                tasksMatchingDueDate[i] = allTasks[i];
            }
        }
        tasksMatchingDueDate = Utils.removeNullObjects(tasksMatchingDueDate);
        return tasksMatchingDueDate;
    }

    //todo method that deletes all done tasks from array

    public static Task[] removeDoneTasks () {
       return Utils.removeTasksByStatus(Status.DONE);
    }

    //todo Get tasks by Engineer

    public static Task[] getTasksByEngineer (Engineer assignee) {
        Task[] tasksMatchingAssignee = new Task[allTasks.length];
        for (int i=0; i<allTasks.length; i++) {
            if (allTasks[i].getAssignee().equals(assignee)) {
                tasksMatchingAssignee[i] = allTasks[i];
            }
        }
        tasksMatchingAssignee = Utils.removeNullObjects(tasksMatchingAssignee);
        return tasksMatchingAssignee;
    }
}
