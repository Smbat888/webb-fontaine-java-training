package collections.queue;

/**
 * Created by Hmayak Atayan on  04, Mar, 2020
 */
public class Dog {
  public float weight;

    public Dog(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("{Dog: %2f}", weight);
    }
}
