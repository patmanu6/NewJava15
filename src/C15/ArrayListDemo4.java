package C15;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(70);

       /* Contains method returns true/false
       if an element is present we will get a true
       otherwise we will get a false
        */

        System.out.println(numbers.contains(60));
        System.out.println(numbers.contains(50));
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
    }
}
