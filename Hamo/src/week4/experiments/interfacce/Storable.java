package week4.experiments.interfacce;

/**
 * Created by: Hmayak on Nov, 2019
 */
public interface Storable {
    int y = 10;

    void storeInFail(String file);

    void storeInText(String text);

    default void delete() {
        System.out.println("in Storable default");
    }

   default void reSize(){
        System.out.println("Storable");
   };
}
