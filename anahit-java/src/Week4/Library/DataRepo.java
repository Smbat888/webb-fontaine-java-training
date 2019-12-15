public class DataRepo {

    static String names[] = {"Dan", "William", "Leo"};
    static String lastNames[] = {"Brown", "Shakespeare", "Tolstoy"};
    static String titles[] = {"Inferno", "Hamlet", "Anna Karenina"};
    static int ages[] = {78, 26, 65};


    public static void ArrayToString(Object[] array) {
        if (array != null)
            for (Object object : array) {
                System.out.println(object);
            }
    }
}
