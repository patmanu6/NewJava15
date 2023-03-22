package C15;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        /*
we can remove the elements from the arrayList based on index or
based on the actual value
 */
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Water Melon");
        System.out.println(fruit);
        fruit.remove(0);
        System.out.println(fruit);
        fruit.remove("Mango");
        System.out.println(fruit);
    }
}
