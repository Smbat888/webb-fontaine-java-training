package classwork.todolist;

import java.time.LocalDate;

public class ToDoListAPI {
    private ToDoListAPI() {
    }

    //if (tasks[i].getAssignee() instanceof Unassigned)
    public static Task[] getUnassignedTasks(Task tasks[]) {
        Task unassignedTasks[] = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().name.equals(Constants.UNASSIGNED)) {
                unassignedTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(unassignedTasks);
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

    public static Task[] getTasksByEngineer(Task tasks[], Engineer engineer) {
        Task engineerTasks[] = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (engineer.equals(tasks[i].getAssignee())) {
                engineerTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(engineerTasks);
    }

    public static Task[] deleteDoneTasks(Task[] tasks) {
        Task[] noDoneTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus() != Status.DONE) {
                noDoneTasks[i] = tasks[i];
            }
        }
        return Utils.removeNullObjects(noDoneTasks);
    }

    //added by me

    public static Task[] changeStatusToDone(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus() == Status.QA) {
                tasks[i].setStatus(Status.DONE);
            }
        }
        return Utils.removeNullObjects(tasks);
    }

    public static Task[] changeEngineer(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().equals(EngineerRepo.get()[1])) {
                tasks[i].setAssignee(EngineerRepo.get()[2]);
            }
        }
        return Utils.removeNullObjects(tasks);
    }

    public static Task[] changeEngineerName(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().getName().equals(EngineerRepo.get()[2].name)) {
                tasks[i].getAssignee().setName(EngineerRepo.get()[0].name);
            }
        }
        return Utils.removeNullObjects(tasks);
    }
}
