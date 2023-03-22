package C14StringsMethods;
/*
 Declare a string variable named str and assign it the value "She sells seashells by the seashore.".
    Call the toCharArray() method on the str variable to convert it to an array of characters. Store the result in a char array variable named
     charArray.
    Declare a string variable named replacedStr and initialize it to an empty string "".
    Iterate through the charArray array using a for-each loop.
    For each character c in the charArray array, check if it is the letter "s" or "S".
    If c is "s" or "S", append a dollar sign "$" to the replacedStr variable.
    If c is not "s" or "S", append the original character c to the replacedStr variable.
    Print the original str string with the message "Original string: " using the System.out.println() method.
    Print the replacedStr string with the message "Replaced string: " using the System.out.println() method.
 */
public class Task5 {
    public static void main(String[] args) {
        String str="She sell seashells by the seashore.";
        char[] charArray =str.toCharArray();
        String replaceStr=" ";


        for (char c:charArray) {


            System.out.println(str);

        }
        //System.out.println(str.replaceAll("[s]","$" ));


    }
}
