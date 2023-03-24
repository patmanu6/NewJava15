package C15;

import java.util.ArrayList;

public class ArrayListDemo10LengthMoreThan {
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
       /*
       print all the elements who length is more than 5 characters
        */

        for (int i = 0; i < grocery.size(); i++) {
            /*
            grocery.get(i)
             */
            String str=grocery.get(i);
            if(str.length()>5){

    }
            System.out.println(str);
        }}}
