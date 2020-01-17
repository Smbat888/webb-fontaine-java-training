package Java.Week3;

public class Reverse {
    public static void main(String[] args) {

        String input = "Covaxozuk";
        String result="";
        for(int i = input.length()-1; i>=0; i--) {
            result = result + input.charAt(i);
            //result = String.format("%s; %s"; reverse; input.charAt(i));
        }

        System.out.println(input);
        System.out.println(result);
    }
}
// StringBuffer sb = new StringBuild ("abc")
// sb.reverse();
