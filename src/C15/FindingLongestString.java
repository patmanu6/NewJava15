package C15;

import java.util.ArrayList;

/*
task5:
    1)Create an ArrayList of Strings
    2)Add the following strings to the ArrayList using the add method: "apple", "banana", "orange", "pear"
    3)Write a loop to find and print the length of the longest string in the ArrayList
=======================================================
 */
public class FindingLongestString {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
         fruits.add("apple");
         fruits.add("banana");
         fruits.add("orang");
         fruits.add("pear");

         String str="";
        for (int i = 0; i < fruits.size(); i++) {
            str= fruits.get(i);
            // fiox this if conditn
            if(fruits.size()>str.length()){

            }
        }
        System.out.println(str);
    }
}
