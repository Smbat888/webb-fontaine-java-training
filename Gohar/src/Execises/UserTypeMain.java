package Execises;

public class UserTypeMain {
    public static void main(String[] args) {
        for (UserType userType : UserType.values()) {
            System.out.println(userType);
        }
        for (UserType userType: UserType.values()){
            System.out.println(userType.getPriority());

        }
        System.out.println(UserType.ADMIN.getPriority());
    }
}
