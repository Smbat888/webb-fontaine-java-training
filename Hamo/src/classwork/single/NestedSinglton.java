package classwork.single;

import week4.Singltone;

/**
 * Created by: Hmayak Atayan on 03 December, 2019
 */
public class NestedSinglton {

    private NestedSinglton() {
    }

    private static class SingltonHolder {
        private static final NestedSinglton instance = new NestedSinglton();
    }

    public static NestedSinglton getInstance() {
        return SingltonHolder.instance;
    }

}
