package C3IfElseConditions.HW;
/*
5) Create a variable age and store some value in it based on this value write if conditions that prints below message
    if age is greater than 60 print "you are old"
    if age is greater than 20 "you are an adult"
    if age is greater than 13 "you are a teenager"
    if age is greater than 3 "you are a kid"
    if age is greater than 0 "you are a baby"
    if age is greater than "invalid age"

 */
public class Task5 {
    public static void main(String[] args) {
        int age=60;

        if(age>60){
            System.out.println("You are old");
        } else if (age>=20) {
            System.out.println("You are an adult");

        } else if (age>13) {
            System.out.println("you are teenager");
        } else if (age>3) {
            System.out.println("You are a baby");
        }else {
            System.out.println("Invalid age");
        }
    }
}
