package classwork;

/**
 * Created by: Hmayak Atayan on 28 November, 2019
 */
public class Bzbzal {
    static String test = "http://ngqa.webbfontaine.am:8095/sd/sd/edit/6954?conversationId=1764867864";

    public static void main(String[] args) {
        String[] text = test.split("\\?")[0].split("/");
        String id = text[text.length - 1];
    }

}

