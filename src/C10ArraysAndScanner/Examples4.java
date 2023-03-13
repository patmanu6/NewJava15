package C10ArraysAndScanner;

import java.util.Arrays;
import java.util.Scanner;

public class Examples4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int size=scanner.nextInt();

        int[] arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please Enter a number");
            arr[i]=scanner.nextInt(); // updating the elements
        }
        System.out.println(Arrays.toString(arr));

    }
}
