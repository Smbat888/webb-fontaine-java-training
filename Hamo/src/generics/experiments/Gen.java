package generics.experiments;

public class Gen<T> {
    private T ob;

Gen (T ob){
    this.ob = ob;
}

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Type of T is:" + ob.getClass().getName());
    }
}
