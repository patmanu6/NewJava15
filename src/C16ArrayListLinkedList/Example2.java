package C16ArrayListLinkedList;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(20.5);
        numbers.add(10.5);
        numbers.add(10.2);
        numbers.add(20.7);
        numbers.add(30.5);

        //Lambda expression
        // umber>11.5 is the condition
        // -> is the part of syntax
        numbers.removeIf(number->number>11.5);
        System.out.println(numbers);
    }
}
