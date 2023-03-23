package C17SetsAndMaps;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Kiwi");
        // There is no get method as data is not stored based on index. also no duplicate

        //  System.out.println(fruit.get(0));
        System.out.println(fruit);
    }
}
