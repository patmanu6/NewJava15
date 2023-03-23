package C17SetsAndMaps;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> grocery=new HashMap<>();
        // put it allows us to store the data inside a map
        grocery.put("Eggs",5);
        grocery.put("Apples",4);
        grocery.put("Bread",6);
        grocery.put("Soap",12);

        System.out.println(grocery);
        // number of elements in the map
        System.out.println(grocery.size());

        // print the count of  elements we have in map
    }
}
