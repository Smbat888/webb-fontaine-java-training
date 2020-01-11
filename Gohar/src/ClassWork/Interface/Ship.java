package ClassWork.Interface;

public class Ship implements Storable{
    @Override
    public void storeInFile(String txt) {
        System.out.println("inch uzum es");
    }

    @Override
    public void storeInXml(String xml) {
        System.out.println("log anel");
    }

}
