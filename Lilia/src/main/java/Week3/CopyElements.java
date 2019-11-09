package Week3;

import java.util.Arrays;


public class CopyElements {
    public static void main(String[] args) {
        String first[] = {"a", "bb", "cc"};
        String copy[] = new String[first.length];
        copy = Arrays.copyOf(first, first.length);
        for (int i = 0; i < first.length; ++i) {
            System.out.print(String.format("[%s%s%s]",copy[i],copy[i],copy[i]));
        }
    }
}
