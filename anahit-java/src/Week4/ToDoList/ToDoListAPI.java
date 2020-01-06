package classworkpackage.todolist;

import java.time.LocalDate;

public class ToDoListAPI {
    private ToDoListAPI() {}


        public static Task[] getUnassignedTasks (Task[] tasks){

            Task[] unassignedTasks = new Task[tasks.length];

            for (int i = 0; i < tasks.length; ++i) {

                if (tasks[i].getAssignee().name.equals(Constants.UNASSIGNED)) {
                    unassignedTasks[i] = tasks[i];
                }
            }
            unassignedTasks= Utils.removeNullObjects(unassignedTasks);
            return unassignedTasks;
        }
    public static Task[] getTasksByStatus(Task[] tasks, Status status) {
        Task[] statusTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus().equals(status)) {
                statusTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(statusTasks);
    }

    public static Task[] getTasksByPriority(Task[] tasks, Priority priority) {
        Task[] priorityTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getPriority().equals(priority)) {
                priorityTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(priorityTasks);
    }
    public static Task[] getTasksByDueDate(Task[] tasks, LocalDate dueDate) {
        Task[] dueDateTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getDueDate().compareTo(dueDate) <= 0) {
                dueDateTasks[i] = tasks[i];
            }
        }

        return Utils.removeNullObjects(dueDateTasks);
    }

    public static Task[] getTasksByEngineer(Task[] tasks, Engineer engineer) {
        Task engineerTasks[] = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (engineer.equals(tasks[i].getAssignee())) {
                engineerTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(engineerTasks);
    }
    }


