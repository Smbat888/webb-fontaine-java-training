package ClassWork.Interface;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.deleteIfStored("delete");
//        System.out.println(Storable.MaxPubliInterfaceStorableSize);
//        System.out.println(Ship.MaxPubliInterfaceStorableSize);

        Track track = new Track();
        track.deleteIfStored("delete");
        System.out.println();
    }

}
