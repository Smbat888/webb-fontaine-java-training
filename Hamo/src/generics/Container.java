package generics;

public class Container<T,V> {
    private T name;
    private V value;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Container{" +
                " name = " + name +
                ", value = " + value +
                '}';
    }
}
