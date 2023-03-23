package C15;

import java.util.ArrayList;

/*
Task3:
    1)Create an ArrayList of Booleans.
    2)Add the following booleans to the ArrayList using the add method:
    true, false, true, false.
    3)Write a loop to count and print the number of true values in the ArrayList.
 */
public class Task3a {
    public static void main(String[] args) {
        ArrayList<Boolean>booleans=new ArrayList<>();

        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);

        int count=0;

        for (int i = 0; i < booleans.size(); i++) {
            Boolean names=booleans.get(i);
            if(booleans.get(i).equals(true)){
                count++;

            }

        }
        System.out.println(count);
    }
}
