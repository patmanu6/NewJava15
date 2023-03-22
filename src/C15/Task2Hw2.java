package C15;

import java.util.ArrayList;

/*
Task2:
    1)Create an ArrayList of Doubles
    2)Add the following doubles to the ArrayList using the add
    method: 3.14, 2.71, 1.618, 4.669
    3)Write a loop to calculate and print the sum of all the doubles
    in the ArrayList

 */
public class Task2Hw2 {
    public static void main(String[] args) {
        ArrayList <Double> numbers=new ArrayList<>();
        numbers.add(3.14);
        numbers.add(2.71);
        numbers.add(1.618);
        numbers.add(4.669);
double sum=0;

        for (int i = 0; i < numbers.size(); i++) {

            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
}
