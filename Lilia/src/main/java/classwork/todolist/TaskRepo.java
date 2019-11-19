package classwork.todolist;

import java.time.LocalDate;

public class TaskRepo {

    private static Task[] tasks = new Task[5];

    static {
        tasks[0] = new Task("Homeworks", "Required for future", Priority.HIGH,
                LocalDate.of(2019, 12, 31));
        tasks[1] = new Task("Classwork", "minor changes", Priority.MEDIUM, LocalDate.now(),
                LocalDate.of(2019, 11, 17), EngineerRepo.get()[1], "java", Status.QA);
        tasks[2] = new Task("meetings", "Mandatory to attend", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2019, 11, 23), EngineerRepo.get()[1], "accepted", Status.QA);
        tasks[3] = new Task("Test case writing", "cover all cases", Priority.HIGH,
                LocalDate.of(2019, 12, 31));
        tasks[4] = new Task("Bug report", "Attachment required", Priority.LOW, LocalDate.now(),
                LocalDate.of(2019, 11, 29), EngineerRepo.get()[1], "done", Status.DONE);
    }

    public static Task[] get() {
        return tasks;
    }

    private TaskRepo() {
    }

}
