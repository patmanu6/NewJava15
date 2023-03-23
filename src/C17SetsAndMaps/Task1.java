package C17SetsAndMaps;

import java.util.HashSet;

/*
  1)Create a HashSet and store fruit like  "Apple" "Banana" "Kiwi"
    2)print all the elements from the set without a loop
    3)Print all the elements from the set using a loop Hint! Try Enhanced loop.
Task2:
 */
public class Task1 {
    public static void main(String[] args) {
        HashSet<String>fruit=new HashSet<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Kiwi");

        for (String fruits:fruit) {
            System.out.println(fruits);
        }
    }
}
