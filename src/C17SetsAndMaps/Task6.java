package C17SetsAndMaps;

import java.util.HashMap;

/*
Create a map to store the grocery and their price
print only those items which contain the letter a
print only those items which are more than 5$
 */
public class Task6 {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("mango", 30);
        items.put("onion", 5);
        items.put("banana", 3);

        items.forEach((k, v) -> {
            if (k.contains("a") ||v> 5) {
                System.out.println(k + " " + v);
            }

        });


    }
}
