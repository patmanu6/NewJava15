package C18Maps;

import java.util.HashMap;

/*
 Create a HashMap object called 'phoneNumbers' that stores a String as key and a Long as value.
    Add the following key-value pairs to the 'phoneNumbers' HashMap using the put() method:
     "John" -> 1234567890, "Mary" -> 2345678901, "Tom" -> 3456789012.
    Print the phone number associated with "Mary" to the console.
 */
public class Task1 {
    public static void main(String[] args) {
        HashMap<String,Long>phonNumbers=new HashMap<>();
        phonNumbers.put("John",1234567890l);
        phonNumbers.put("Mary",2345876925l);
        phonNumbers.put("Tom",85258658545l);

        System.out.println(phonNumbers.get("Mary"));


    }
}
