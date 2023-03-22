package C15;

import java.util.ArrayList;

public class ArrayListDemo8 {
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
        System.out.println(fruit.isEmpty());
        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("onion");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("carrot");

        ArrayList<String> grocery=new ArrayList<>();
        grocery.addAll(fruit);
        grocery.addAll(vegetables);
        System.out.println(grocery);
    }
}
