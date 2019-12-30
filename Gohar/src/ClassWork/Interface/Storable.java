package ClassWork.Interface;

public interface Storable {
    int MaxPubliInterfaceStorableSize = 55;

    void storeInFile(String txt);

    void storeInXml(String xml);


    default void deleteIfStored(String filename) {
        System.out.println("default");
    }

    default void reSize(String text) {
        System.out.println("default2");
    }

    static boolean isNull(String x) {
        return x.equals(null);


    }
}
