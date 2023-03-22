package C15;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
       /*
    Set is the method that replaces the elements on a specific index
    it requires two parameters one is index and other one is value

 */
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Water Melon");
        // replace elements
        fruit.set(1,"Banana");
        System.out.println(fruit);
        // removes everything from the arrayList
        fruit.clear();
        System.out.println(fruit);
    }
}
