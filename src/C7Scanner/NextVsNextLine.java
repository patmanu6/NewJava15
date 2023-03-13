package C7Scanner;

import java.util.Scanner;

public class NextVsNextLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a sentence");
        /*
        next() method can't take more than one words
        nextLine however can take complete paragraphs as well
         */
        System.out.println(scanner.nextLine());
    }
}
