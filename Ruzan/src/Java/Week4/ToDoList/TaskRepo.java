package Java.Week4.ToDoList;

import java.time.LocalDate;

public class TaskRepo {

    private static Task[] tasks = new Task[5];

    static {
        tasks [0] = new Task("Homeworks", "REQUIRED FOR FUTURE", Priority.HIGH, LocalDate.of(2019,12,31));
        tasks [1] = new Task ("Classwork", "Also required", Priority.HIGH, LocalDate.now(), LocalDate.of(2019,11,
                16),EngineerRepo.get()[0], "java", Status.TODO);
        tasks [2] = new Task ("Voyage", "PCS CI", Priority.MEDIUM, LocalDate.now(), LocalDate.of(2020,01,
                31),EngineerRepo.get()[1], "java", Status.IN_PROGRESS);
        tasks [3] = new Task("Hard Work", "Mus be done", Priority.LOW, LocalDate.now(), LocalDate.of(2020,12,31),
                EngineerRepo.get()[2], "Covaxozuk", Status.READY_FOR_QA);
        tasks [4] = new Task("Manifest", "REQUIRED", Priority.HIGH,LocalDate.now(), LocalDate.of(2019,11,30),
                EngineerRepo.get()[2], "Project", Status.READY_FOR_QA);

     }


    private TaskRepo() {
        ///empty constructor for EngineerRepo is to avoid new instance creation

    }


    public static Task[] get() {
        return tasks;
    }

    public static Task[] getTasks() {
        return tasks;
    }
}
