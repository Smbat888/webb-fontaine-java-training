package reflection;

import java.io.Serializable;

public class Demo extends SuperDemo implements Serializable, Cloneable {

    private String name;
    public int age;
    public boolean married = false;

    private static volatile int sVolume = 23;

    private void smile() {
        System.out.println(" smile");
    }

    public void joke() {
        System.out.println(" joke");
    }

    public int wave(String name, int age) {
        System.out.println(" wave");
        return 1;
    }

    public void varArgsExample(int age, double weight, String ... args) {
        int length = args.length;
        String x = args[0];
    }

    public static void myMethod() {
        System.out.println("my method");
    }
}
