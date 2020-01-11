package classprojects.classwork312;

public class NestedSingleton {

    private static class  SingletonHolder {
        private static  final NestedSingleton instance = new NestedSingleton();
    }

    private  NestedSingleton(){
        System.out.println("nested created");
    }

    public static NestedSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
