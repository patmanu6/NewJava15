package C16ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.remove(2);
        System.out.println(numbers);

        LinkedList<Integer> numbers2=new LinkedList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(50);

        numbers2.remove(2);
    }
}
