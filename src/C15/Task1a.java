package C15;

import java.util.ArrayList;

/*
Task1:
    1)Create an ArrayList of Integers
    2)Store numbers 10 30 40 50 using add method
    3)write a loop to print all the numbers
 */
public class Task1a {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
