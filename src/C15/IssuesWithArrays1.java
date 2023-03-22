package C15;

import java.util.Scanner;

public class IssuesWithArrays1 {
    public static void main(String[] args) {

        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter a number");
            numbers[i] = scanner.nextInt();
        }
    }
}
