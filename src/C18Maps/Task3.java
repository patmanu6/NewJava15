package C18Maps;

import java.util.HashMap;

/*
 Create a HashMap object called 'bookPrices' that stores a String as key and a Double as value.
    Add the following key-value pairs to the 'bookPrices' HashMap using the put() method: "Java Programming" -> 45.99, "Data Structures" -> 32.50, "Algorithms" -> 50.00, "Python Basics" -> 20.00.
    Print the names of all the books in the 'bookPrices' HashMap that have a price greater than 40.00.
    Print the names of all the books in the 'bookPrices' HashMap that contain the letter 'o'.
 */
public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Double> books = new HashMap<>();
        books.put("Java Programming", 45.99);
        books.put("Data Structures", 32.50);
        books.put("Algorithms", 50.00);
        books.put("Python Basics", 20.00);

        books.forEach((k, y) -> {
            if (y > 40.00 && k.contains("o")) {
                System.out.println(k + " " + y);
            }
        });
    }

}