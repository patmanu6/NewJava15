package C14StringsMethods;
/*
Task:split()
    Declare a string variable and assign it a value that contains one or more words separated by spaces.
    Call the split() method on the string variable and pass a space character as the argument.
    Store the result in a string array variable.
    Iterate through the string array using a loop and print each element.

 */
public class Task2 {
    public static void main(String[] args) {
        String sentence="Please remember, to bring your, lunch bag!";
        String[] sent=sentence.split(" ");


        for (String s : sent) {
            System.out.println(s);

        }

    }
}
