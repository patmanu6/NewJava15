package C15;

import java.util.ArrayList;

/*
Task4:
    1)Create an ArrayList of Integers
    2)Add the following integers to the ArrayList using the add method: 10, 20, 30, 40, 50
    3)Write a loop to find and print the maximum value in the ArrayList
 */
public class Task4Hw4 {
    public static void main(String[] args) {
        ArrayList<Integer>maxValue=new ArrayList<>();

        maxValue.add(10);
        maxValue.add(20);
        maxValue.add(30);
        maxValue.add(40);
        maxValue.add(200);

        int greater=0;
        for (int i = 0; i < maxValue.size(); i++) {
            greater= maxValue.get(i);

            if(maxValue.get(i)>greater){

            }

        }
        System.out.println(greater);
    }
}
