package generics.experiments;

public class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    public void showTypes(){
        System.out.println("type of T is " +  getOb1().getClass().getName());
        System.out.println("type of V is " +  getOb2().getClass().getName());

    }
}
