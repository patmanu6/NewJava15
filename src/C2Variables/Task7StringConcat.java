package C2Variables;
/*
6)Declare two variables firstName and lastName of type String and initialize them to your first and
last name. Use string concatenation to create a new variable greeting that says "Hello, [firstName]
[lastName]!". Print the value of greeting.
 */
public class Task7StringConcat {
    public static void main(String[] args) {
        String firsName="Pat";
        String lastName="Baller";
        String concat="Hello "+firsName+" "+lastName+"!";
        System.out.println(concat);

    }
}
