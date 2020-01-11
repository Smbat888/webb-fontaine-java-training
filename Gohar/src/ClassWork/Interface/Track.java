package ClassWork.Interface;

public class Track implements Storable {
    @Override
    public void storeInFile(String txt) {
        System.out.println("track store file");

    }

    @Override
    public void storeInXml(String xml) {
        System.out.println("track store XML");

    }

    @Override
    public void deleteIfStored(String filename) {
        System.out.println("default track");

    }
}
