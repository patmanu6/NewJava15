package C7Scanner;

import java.util.Scanner;

public class CharInputsDemo {
    public static void main(String[] args) {
        Scanner fetch=new Scanner(System.in);
        System.out.println("Please Enter your gender");
        // char c=''
        // next method can take many character that's why we use
        // character method to get only one character and 0 means the first
        // character
        System.out.println(fetch.next().charAt(0));
    }
}
