package C18Maps;

import java.util.HashMap;

/*Task2:
    Create a map to store the grocery and their price
    "Eggs"-> 5, "Apple"-> 20 "Bread" -> 15
    print only those items which contain the letter a
    print only those items which are more than 5$

 */
public class Task2 {
    public static void main(String[] args) {
        HashMap<String,Integer>letters=new HashMap<>();
        letters.put("Eggs",5);
        letters.put("Apple",20);
        letters.put("Bread",15);

        letters.forEach((k,y)->{if(k.contains("a")&&y>5) {
            System.out.println(k + " " + y);
        }});

        // System.out.println(letters.containsKey("a")||letters.values()>5);
    }
}
