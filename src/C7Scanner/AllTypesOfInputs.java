package C7Scanner;

import java.util.Scanner;

public class AllTypesOfInputs {
    public static void main(String[] args) {
        Scanner fetch=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age= fetch.nextInt();
        System.out.println("Please Enter the price of eggs");
        double eggPrice=fetch.nextDouble();
        System.out.println("Please Enter you gender F/M");
        char gender=fetch.next().charAt(0);
        System.out.println("Do you like java");
        boolean likeJava=fetch.nextBoolean();

        System.out.println("Your favorite programming language");
        String language=fetch.next();
        System.out.println("Please Enter your address");
        /*
        when ever you are calling any other methods like next() nextInt() etc
        you must call nextLine() twice otherwise it will not wait
        for your input as it can consume the last enter pressed by the
        user as well
         */
        fetch.nextLine();
        String address=fetch.nextLine();

        System.out.println(age);
        System.out.println(eggPrice);
        System.out.println(gender);
        System.out.println(likeJava);
        System.out.println(language);
        System.out.println(address);
    }


}
