package C15;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Mango");
        grocery.add("Kiwi");
        grocery.add("Watermelon");
        grocery.add("onion");
        grocery.add("Potato");
        grocery.add("Tomato");
        grocery.add("Mango");
        grocery.add("carrot");

        for (int i = 0; i < grocery.size(); i++) {
            String str = grocery.get(i);
            if(str.contains("a")){
                grocery.set(i,"Bread");
            }
    }
}}
