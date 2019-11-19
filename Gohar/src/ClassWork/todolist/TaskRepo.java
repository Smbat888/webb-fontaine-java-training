package ClassWork.todolist;

import java.time.LocalDate;

public class TaskRepo {

    private static Task[] tasks = new Task[5];

    static {
        tasks[0] = new Task("Homeworks", "Required for future",
                Priority.HIGH, LocalDate.of(2019, 12, 31));
        tasks[1] = new Task("Hard Work", "also required",
                Priority.HIGH, LocalDate.now(), LocalDate.of(2019, 11, 17),
                EngineerRepo.get()[0], "java", Status.TODO);
        tasks[2] = new Task("Class Work", "also required",
                Priority.LOW, LocalDate.now(), LocalDate.of(2019, 11, 17),
                EngineerRepo.get()[1], "java", Status.DONE);
        tasks[3] = new Task("Work", "also required",
                Priority.MEDIUM, LocalDate.now(), LocalDate.of(2019, 11, 17),
                EngineerRepo.get()[2], "java", Status.TECH_REVIEW);
        tasks[4] = new Task("More works", "Required for future",
                Priority.LOW, LocalDate.of(2019, 12, 31));

    }

    private TaskRepo() {

    }

    public static Task[] get() {
        return tasks;
    }
}
