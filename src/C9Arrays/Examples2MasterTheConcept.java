package C9Arrays;

public class Examples2MasterTheConcept {
    public static void main(String[] args) {
          /*
        if else
        loops     These right here get you the Job. Master it like no tommorow.
        arrays
        classes and method
         */
        int [] numbers={10,20,45,67};


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("*************");
        // gives us the number of elements in the array. remember access element in array by index.
        System.out.println(numbers.length);
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
