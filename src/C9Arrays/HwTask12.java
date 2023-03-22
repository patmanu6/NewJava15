package C9Arrays;

import java.util.Scanner;

/*
Task12:
Create an array of size 5
use scanner class to take 5 numbers from user and store them inside above array
print all the elements from above array using a loop
task13:
 */
public class HwTask12 {
    public static void main(String[] args) {

      /*  Scanner obj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number0=obj.nextInt();
        System.out.println("Please enter a number");
        int number1=obj.nextInt();
        System.out.println("Please enter a number");
        int number2=obj.nextInt();
        System.out.println("Please enter a number");
        int number3=obj.nextInt();
        System.out.println("Please enter a number");
        int number4=obj.nextInt();
        System.out.println("Please enter a number");
        int number5=obj.nextInt();*/


        Scanner obj = new Scanner(System.in);
        int[] arr = {0};
        System.out.println("Please enter a number");
        int numb = obj.nextInt();
        numb = arr.length;

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
