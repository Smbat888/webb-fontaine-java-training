package collections.queue.queueDemo;

import collections.queue.Dog;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Hmayak Atayan on  04, Mar, 2020
 */
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Dog> dogs = new PriorityQueue<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog dog1, Dog dog2) {
                if (dog1.weight > dog2.weight) {
                    return 1;
                } else if (dog1.weight == dog2.weight) {
                    return 0;
                } else return -1;
            }
        });

        dogs.add(new Dog(3.4f));
        dogs.add(new Dog(73.4f));
        dogs.add(new Dog(3.4f));
        dogs.add(new Dog(32.4f));
        dogs.add(new Dog(2.7f));
        dogs.add(new Dog(1.4f));

    }
}
