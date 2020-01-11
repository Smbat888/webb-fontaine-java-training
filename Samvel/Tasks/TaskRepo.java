package classwork2.todolist;

import java.time.LocalDate;

public class TaskRepo {

    private static Task[] tasks = new Task[5];

    static {
        tasks[0] = new Task("Homeworks", "Required for Future", Priority.HIGH,
                LocalDate.of(2019,12, 31));
        tasks[1] = new Task("Classwork", "Also Required", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2019, 11,7), EngineerRepo.get()[0],"ToBeAutomated", Status.TODO);
        tasks[2] = new Task("Random", "Not required", Priority.LOW, LocalDate.now(),
                LocalDate.of(2019, 11,9), EngineerRepo.get()[1],"Not relevant", Status.QA);
        tasks[3] = new Task("Drink coffee", "Drink coffee during class", Priority.MEDIUM, LocalDate.now(),
                LocalDate.of(2019, 11,10), EngineerRepo.get()[2],"Nescafe", Status.IN_PROGRESS);
        tasks[4] = new Task("Research", "Research about singleton", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2019, 11,8), EngineerRepo.get()[3],"Singleton", Status.TECH_REVIEW);
    }

    private TaskRepo() {

    }

    public static Task[] get() {
        return tasks;
    }

}
