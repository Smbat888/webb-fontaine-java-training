package week4.experiments.bzbzal;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class tuft {


    public static String[] hsCodes = {"0201100000", "0301110000", "1001990000", "2201101000", "4401100000", "2701110000",
            "5603120000", "6001210000", "3824600000"};

    public static String setHsCode() {
        return hsCodes[(int) (Math.random() * hsCodes.length)];
    }

    public static void main(String[] args) {
        System.out.println(setHsCode());
    }
}
