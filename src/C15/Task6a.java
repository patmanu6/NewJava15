package C15;

import java.util.ArrayList;

/*
Task6:
    1)Create an ArrayList of Strings
    2)Add the following strings to the ArrayList using the add method: "red", "green", "blue", "yellow"
    3)Remove all the strings that start with the letter "b"
    4)Write a loop to print the remaining strings in the ArrayList
 */
public class Task6a {
    public static void main(String[] args) {
        ArrayList <String> letters=new ArrayList<>();
        letters.add("red");
        letters.add("green");
        letters.add("blue");
        letters.add("yellow");

        letters.removeIf(x->x.startsWith("b"));
        System.out.println(letters);

    }
}
