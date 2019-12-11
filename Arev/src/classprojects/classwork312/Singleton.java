package classprojects.classwork312;

public class Singleton {
    private static Singleton instance;
    private String status;

    private Singleton(String status){
        this.status = status;
        System.out.println("singleton created");
    }

    public static Singleton getInstance(String status){
        if(instance == null){
            instance = new Singleton(status);
        }
        return instance;
    }
    public void foo(){
        System.out.println("fooooo");
    }
}
