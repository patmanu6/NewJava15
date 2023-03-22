package C15;

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        /*

indexOf method
 */
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Water Melon");

        System.out.println(fruit.indexOf("Mango"));
        System.out.println(fruit.indexOf("Banana"));
    }
}
