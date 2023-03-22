package C15;

import java.util.ArrayList;

/*
Task8:
    1)Create an ArrayList of Strings
    2)Add the following strings to the ArrayList using the add method: "apple", "banana", "orange", "pear"
    3)Remove all the strings that contain the letter "a"
 */
public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> grocery=new ArrayList<>();
        grocery.add("apple");
        grocery.add("banana");
        grocery.add("orange");
        grocery.add("pear");
       grocery.removeIf(x->x.contains("a"));

        System.out.println(grocery);


    }
}
