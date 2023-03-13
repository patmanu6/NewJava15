package C9Arrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
    /*
        when we have to store few values we can use variables
        but when we have to store a lot of data we should be going with arrays
        as managing the data becomes really easy with arrays
         */
        String name="patrick";
        String name1="Sarah";
        String name2="Usman";
        String name3="Charles";
        System.out.println(name+" "+name1+" "+name2+" "+name3);

        String name4=""; // initialing the variable with empty String
        String name5; // not initialing the variable
        String [] names={}; // initialing the array with zero elements
        String [] names2; // not initialing the variable
        /*
        creates an array and initializing it with four elements
         */
        String[] testers={"Usman","Sarah","patrick","Charles"};
        System.out.println(testers[0]);
        System.out.println(Arrays.toString(testers));



    }
}
