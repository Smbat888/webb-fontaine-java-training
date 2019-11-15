package week4.tooyn;

/**
 * Created by: Hmayak on Nov, 2019
 */
public enum UserType {
    ADMIN(5),
    USER(1),
    HULK(3),
    SPIDERMAN(0),
    SUPER(2),
    TEST(6),
    TESTOYAN(4);

    private int priority;

    UserType(int prority) {
        this.priority = prority;
    }

    public  int getPriority(){
        return priority;
    }

}
