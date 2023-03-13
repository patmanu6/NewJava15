package C10ArraysAndScanner;

import java.util.Arrays;
import java.util.Scanner;

public class Examples3 {
    public static void main(String[] args) {
        //creating an empty array of size 50
        int[] arr=new int[4];
        // we are storing 10 on each location
        Scanner scanner=new Scanner(System.in);
        /*
        This loop will execute 4 times as the time of the array is 4
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please Enter a number");
            /*
            asking the user to enter numbers
             */
            //arr[i]= we are storing an element on this location
            arr[i]=scanner.nextInt();
        }

        // we are printing all the elements
        System.out.println(Arrays.toString(arr));



    }
}
