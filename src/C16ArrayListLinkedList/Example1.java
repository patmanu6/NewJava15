package C16ArrayListLinkedList;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(20.5);
        numbers.add(10.5);
        numbers.add(10.2);
        numbers.add(20.7);
        numbers.add(30.5);
        // remove all the elements which are greater than 11.5 using
        //a loop
        for (int i = 0; i < numbers.size(); i++) {
            Double number=numbers.get(i);
            if(number>11.5){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
