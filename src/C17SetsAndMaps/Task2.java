package C17SetsAndMaps;

import java.util.TreeSet;

/*
 1)Create a Set  called 'words' that stores a String.
    2)Add the following strings to the 'words' TreeSet using the add() method: "apple", "banana", "orange", "peach".
    3)Write a loop to print all the words in alphabetical order.
 */
public class Task2 {
    public static void main(String[] args) {
        TreeSet<String>word=new TreeSet<>();
        word.add("apple");
        word.add("banana");
        word.add("orange");
        word.add("peach");

        for (String words:word) {
            System.out.println(words);
        }
    }
}
