package C15;

import java.util.ArrayList;
import java.util.Scanner;

public class IssuesWithArrays2 {
    public static void main(String[] args) {


        //int[] numbers=new int[4];
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter a number");
            numbers.add(scanner.nextInt());
        }
    }
}
