package C17SetsAndMaps;

import java.util.TreeSet;

/*
k4:
    1)Create a TreeSet object called 'ages' that stores an Integer.
    2)Add the following integers to the 'ages' TreeSet using the add() method: 20, 25, 30, 35.
    3)Remove all the elements from the TreeSet that are less than 30, then print the remaining elements of the TreeSet
Task5:
 */
public class Task4 {
    public static void main(String[] args) {
        TreeSet<Integer>ages=new TreeSet<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        ages.add(35);
ages.removeIf(x->x<30);
        System.out.println(ages);
    }
}
