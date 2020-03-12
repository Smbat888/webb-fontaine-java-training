package collections.lambdademo;

/**
 * Created by Hmayak Atayan on  07, Mar, 2020
 */
public class LabdaDemo {
    public static void main(String[] args) {
        MyNumber number = () -> 123;
    }
}

interface MyNumber {
    int getValue();
}
