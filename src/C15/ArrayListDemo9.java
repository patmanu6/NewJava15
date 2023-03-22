package C15;

import java.util.ArrayList;

public class ArrayListDemo9 {
    public static void main(String[] args) {
        /*

indexOf method
 */
        ArrayList<String> grocery=new ArrayList<>();
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Mango");
        grocery.add("Kiwi");
        grocery.add("Water Melon");
        grocery.add("onion");
        grocery.add("Potato");
        grocery.add("Tomato");
        grocery.add("carrot");
        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("onion");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("carrot");

        grocery.removeAll(vegetables);
        System.out.println(grocery);
    }
}
