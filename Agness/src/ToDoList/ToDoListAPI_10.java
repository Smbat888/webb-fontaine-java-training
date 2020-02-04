public class ToDoListAPI_10 {
    private ToDoListAPI_10(){
    }
    //if (tasks[i].getAssignee() instanceof Unassigned)
    public static Task_1[] getUnassignedTasks(Task_1 tasks[]) {   //unassigned taskery ta
        Task_1 unassignedTasks[] = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getAssignee().name.equals(Constants_6.UNASSIGNED)) {
                unassignedTasks[i]=tasks[i];
            }
        }
        unassignedTasks= Utils_11.removeNullObjects(unassignedTasks);  //6 hat a tasky, 3 haty anassigned, null chtpelu hamar create util
        return unassignedTasks;
    }

    public static Task_1[] getTaskByStatus(Task_1[] tasks, Status_3 status) {
        Task_1[] getTaskByStatus = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (status == tasks[i].getStatus()) {
                getTaskByStatus[i] = tasks[i];
            }
        }
        return Utils_11.removeNullObjects(getTaskByStatus);
    }

    public static Task_1[] getTaskByPriority(Task_1[] tasks, Priority_2 priority) {
        Task_1[] getTaskByPriority = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (priority == tasks[i].getPriority()) {
                getTaskByPriority[i] = tasks[i];
            }
        }
        return Utils_11.removeNullObjects(getTaskByPriority);
    }

    public static Task_1[] getTaskByDueDate(Task_1[] tasks, String dueDate) {
        Task_1[] getTaskByDueDate = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (dueDate.equals(tasks[i].getDueDate().toString())) {
                getTaskByDueDate[i] = tasks[i];
            }
        }
        return Utils_11.removeNullObjects(getTaskByDueDate);
    }

    public static Task_1[] deleteDoneTasks(Task_1[] tasks) {

        Task_1[] tasksWithoutDone = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus() != Status_3.DONE) {
                tasksWithoutDone[i] = tasks[i];
            }
        }
        return Utils_11.removeNullObjects(tasksWithoutDone);
    }

    public static Task_1[] getTasksForEngineers(Task_1[] tasks){
        Task_1[] enginnersTask = new Task_1[tasks.length];
        for (int i = 0; i < tasks.length ; i++) {
            for (Engineer_4 engineer: EngineerRepo_8.get()) {
                if (tasks[i].getAssignee().getName().equals(engineer.name) ){
                    enginnersTask[i] = tasks[i];
                }
            }
        }
        return Utils_11.removeNullObjects(enginnersTask);
    }
}