package C15;

import java.util.ArrayList;

public class YouCantRemoveElementLoop {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(20.5);
        numbers.add(10.5);
        numbers.add(10.5);
        numbers.add(20.5);
        numbers.add(30.5);
        //remove all the elements which are greater than 11.5 using loop

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.remove(i)>=11.5){

            }

        }
//use remove if method
        System.out.println(numbers);
    }
}
