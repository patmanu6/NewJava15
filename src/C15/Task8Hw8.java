package C15;

import java.util.ArrayList;

/*
Task8:
    1)Create an ArrayList of Strings
    2)Add the following strings to the ArrayList using the add method: "apple", "banana", "orange", "pear"
    3)Remove all the strings that contain the letter "a"
 */
public class Task8Hw8 {
    public static void main(String[] args) {
        ArrayList<String>alphabelt=new ArrayList<>();
        alphabelt.add("apple");
        alphabelt.add("banana");
        alphabelt.add("orange");
        alphabelt.add("pear");
        alphabelt.add("cheese");

        alphabelt.removeIf(x->x.contains("a"));
        System.out.println(alphabelt);
    }
}
