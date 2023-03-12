package C3IfElseConditions.HW;
/*
3) Declare a String variable called "color" and assign it a value.
   Use if conditions to print a message based on the value of "color".
   If the value of "color" is "red", print "Your favorite color is red".
   If the value is "blue", print "Your favorite color is blue".
   If the value is "green", print "Your favorite color is green".
 */
public class Task3 {
    public static void main(String[] args) {
        String color="White";
        if(color.equals("White")){
            System.out.println(color+" is my favourite color");
        } else if (color.equals("Blue")) {
            System.out.println("My favourite color is blue");

        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("My favourite color is green");
        }

    }
}
