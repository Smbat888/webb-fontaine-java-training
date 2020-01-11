import java.time.LocalDate;
public class TaskRepo_9 {
    private static Task_1[] tasks=new Task_1[5];
    static {
        tasks[0] = new Task_1("Homeworks","Required for future",Priority_2.HIGH,
                LocalDate.of(2019,12,31));
        tasks[1] = new Task_1("Classwork","Minor changes",Priority_2.MEDIUM,LocalDate.now(),
                LocalDate.of(2019,11,17),EngineerRepo_8.get()[0],"java",Status_3.TODO);
        tasks[2] = new Task_1("Meetings","Mandatory to attend",Priority_2.HIGH,LocalDate.now(),
                LocalDate.of(2019,11,23),EngineerRepo_8.get()[1],"accepted",Status_3.IN_PROGRESS);
        tasks[3] =new Task_1("Test case writing","cover all cases",Priority_2.HIGH,
                LocalDate.of(2019,12,31));
        tasks[4]= new Task_1("Bug report","Attachment required",Priority_2.LOW,LocalDate.now(),
                LocalDate.of(2019,11,29),EngineerRepo_8.get()[3],"done",Status_3.DONE);
    }
    public static Task_1[]get(){
        return tasks;
    }
    private TaskRepo_9(){
    }
}