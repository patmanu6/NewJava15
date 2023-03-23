package C17SetsAndMaps;

import java.util.ArrayList;

public class BoxingDemo1 {
    public static void main(String[] args) {
        int number=10;
        // Process of converting a primitive data to a wrapper type is called
        // boxing
        Integer wrapperNumber=new Integer(number); //passing variable in the perimeter to which you will want to box
        /*
        converting a primitive to a wrapper type the easier way
        autoBoxing
         */
        Integer wrapperNumber2=number;//Another way without the new keyword. Initialize it to the primitive variable
        int number1=20;
        int number2=40;
        int number3=50;

        /*
        we have a problem here if we have used primitive data types in our
        code and we need to use ArrayList or any other class from collections
        framework what should we do?
         */
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(number);
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        System.out.println(numbers);

    }
}
