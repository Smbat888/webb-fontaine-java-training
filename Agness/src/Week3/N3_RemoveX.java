package Week3;

public class N3_RemoveX {
    public static void main (String[] args) {
        String[] noX = {"x", "xa", "xii"};
        Remove(noX);
    }

    private static void Remove(String[] noX) {
        for(int i=0; i<=noX.length; i++) {
                String a = noX[i].replace("x","");
                System.out.println(a);
        }
    }
}
