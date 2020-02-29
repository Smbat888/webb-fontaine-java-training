package generics.experiments;

public class GenOOP <T extends Parent> {
   private T ob1;

    public GenOOP(T ob1) {
        this.ob1 = ob1;
    }

    public T getOb1() {
        return ob1;
    }
}
