package oop.week3;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Գրել ֆունկցիա, որը տրված String-nերի զանգվածի յուրաքանչյուր էլեմենտից կջնջի “x” սիմվոլը եւ կվերադարձնի զանգվածը;
 * Օրինակ՝ 	noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 */
public class RemoveChar {
    static String[] noX = {"ax", "bb", "cx"};
    static String[] noY = {"yax", "byb", "cyx"};
    static String[] noZ = {"yzax", "zbyb", "cyxz"};

    public static void main(String[] args) {
        for (String a : noMentionedElement(noZ, "z")
        ) {
            System.out.println(a);
        }
    }

    public static String[] noMentionedElement(String[] array, String characterToRemove) {
        String newArray[] = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i].replaceAll(characterToRemove, "");
        }
        return newArray;
    }
}
