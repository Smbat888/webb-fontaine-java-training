package classwork;

/**
 * Created by: Hmayak Atayan on 26 January, 2020
 */
public class Switch {

    public static void main(String[] args) {
        tpiSeason("garukkn");
    }

    public static void tpiSeason(String season) {
        switch (season) {
            case "amar": {
                System.out.println("amara");
                break;
            }
            case "ashun": {
                System.out.println("ashun");
                break;
            }
            case "garun": {
                System.out.println("garun");
                break;
            }
            default: {
                System.out.println("sxales grel");
            }
        }
    }
}
