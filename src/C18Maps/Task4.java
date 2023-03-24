package C18Maps;

import java.util.TreeMap;

/*
Create a TreeMap object called 'movieRatings' that stores a String as key and an Integer as value.
    Add the following key-value pairs to the 'movieRatings' TreeMap using the put() method: "The Godfather" -> 9, "Star Wars" -> 8, "The Shawshank Redemption" -> 10, "Forrest Gump" -> 7.
    Print the names of all the movies in the 'movieRatings' TreeMap that have a rating greater than 8.
    Print the rating of the movie "The Shawshank Redemption" from the 'movieRatings' TreeMap.
 */
public class Task4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> ratings = new TreeMap<>();

        ratings.put("The Godfather", 9);
        ratings.put("Star Wars", 8);
        ratings.put("The ShawShank Redemption", 10);
        ratings.put("The Forest Gump", 7);

        ratings.forEach((k, y) -> {
            if (y > 8) {
                System.out.println(k + " " + y);
            }
        }); System.out.println(ratings.get("The ShawShank Redemption"));
       // System.out.println(ratings.get("The ShawShank Redemption"));
    }
}
