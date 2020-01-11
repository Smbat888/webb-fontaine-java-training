package classwork.single;


/**
 * Created by: Hmayak Atayan on 03 December, 2019
 */
public class SingleTon {
    private static SingleTon singleTone;

    public static SingleTon getInstance() {
        if (singleTone == null) {
            singleTone = new SingleTon();
        }
        return singleTone;
    }

    private SingleTon() {
    }
}
