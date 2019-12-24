package week4.experiments.interfacce;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Ship implements Storable {


    @Override
    public void storeInFail(String file) {

    }

    @Override
    public void storeInText(String text) {
        System.out.println("102");
    }

    @Override
    public void delete() {


    }

    @Override
    public void reSize() {

    }

}

