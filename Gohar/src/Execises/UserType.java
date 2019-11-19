package Execises;

public enum UserType {
    ADMIN(8),
    USER(5),
    GUEST(2),
    SUPER_ADMIN(0);

    private int priority;
    UserType(int priority){
        this.priority = priority;
    }

    public int getPriority() {
        return priority;

    }
}
