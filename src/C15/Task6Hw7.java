package C15;

import java.util.ArrayList;

/*
Task7:
    1)Create an ArrayList of Integers
    2)Add the following integers to the ArrayList using the add method: 10, 20, 30, 40
    3)Remove all the even numbers from the ArrayList
 */
public class Task6Hw7 {
    public static void main(String[] args) {
        ArrayList<Integer>evenNumbers=new ArrayList<>();
        evenNumbers.add(10);
        evenNumbers.add(20);
        evenNumbers.add(30);
        evenNumbers.add(40);
        evenNumbers.add(43);


        evenNumbers.removeIf(x->x%2==0);
        System.out.println(evenNumbers);


    }
}
