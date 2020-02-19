package oop.week3;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class MultipleElementsInArray {

    public static void main(String[] args) {
        String[] elements = {"aa", "bbb", "cccc"};
        String[] multipledArr = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            multipledArr[i] = String.format("%s%s%s", elements[i], elements[i],elements[i]);
        }
        for (String element : multipledArr)
        {
            System.out.println(element);
        }
    }
}
