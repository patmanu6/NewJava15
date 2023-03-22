package C15;

import java.util.ArrayList;

public class ArrayListDemo11 {
    public static void main(String[] args) {
        /*

indexOf method
 */
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Mango");
        grocery.add("Kiwi");
        grocery.add("Water Melon");
        grocery.add("onion");
        grocery.add("Potato");
        grocery.add("Tomato");
        grocery.add("carrot");

       /*
       print only those elements which have the letter n
        */
        for (int i = 0; i < grocery.size(); i++) {
            String str = grocery.get(i);
            if (str.contains("n")) {
                System.out.println(str);
            }
        }
    }
}
