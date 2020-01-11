package classworkpackage.todolist;

import java.time.LocalDate;

public class TaskRepo {

    private static Task[] tasks= new Task[5];

    static {
        tasks[0]=new Task("Homeworks", "Future", Priority.HIGH, LocalDate.of(2019,12,31));
        tasks[1]=new Task("Classwork", "important task", Priority.HIGH, LocalDate.now(), LocalDate.of(2019, 11, 17), EngineerRepo.get()[1], "tobeautomated", Status.DONE);
        tasks[2]=new Task("Regression", "regression for URM", Priority.MEDIUM, LocalDate.now(), LocalDate.of(2019, 11, 15), EngineerRepo.get()[2], "tobeautomated", Status.DONE);
        tasks[3]=new Task("Meetings", "participate in 3 meetings", Priority.LOW, LocalDate.now(), LocalDate.of(2019, 12, 1), EngineerRepo.get()[3], "MEETINGS", Status.IN_PROGRESS);
        tasks[4]=new Task("DB Clean Up", "clean up DB", Priority.MEDIUM, LocalDate.of(2019,11,30));


    }

private TaskRepo(){
    //empty private constructor for avoiding new instance creation

}

public static Task[] get() {
    return tasks;
}


}
