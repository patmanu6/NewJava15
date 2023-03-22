package C14StringsMethods;
/*
 Declare a string variable named sentence and assign it the value "The quick brown fox jumps over the lazy dog.".
    Call the split() method on the sentence variable and pass a space " " as the delimiter to split the sentence into an array of words.
     Store the result in a string array variable named words.
    Declare a string variable named reversedSentence and initialize it to an empty string "".
    Iterate through the words array in reverse order using a for loop that starts at the last index (words.length - 1)
    and ends at the first index (0).
    For each word in the words array, add it to the reversedSentence variable with a space " " appended to it.
    Print the original sentence string with the message "Original sentence: " using the System.out.println() method.
    Print the reversed reversedSentence string with the message "Reversed sentence: " using the System.out.println() method. Use the trim() method to remove the trailing space at the end of the reversed sentence
Expected output:
Original sentence: The quick brown fox jumps over the lazy dog.
Reversed sentence: dog. lazy the over jumps fox brown quick The
 */

public class Task4 {
    public static void main(String[] args) {
        String sentence="The quick brown fox jumps over the lazy dog.";
       String[] words= sentence.split(" ");
       String reversedSentence=" ";

        for (int i = words.length-1; i >0 ; i--) {

            reversedSentence=reversedSentence+words[i]+" " ;
        }






        System.out.println("The original sentence is "+ sentence);
        System.out.println("The Reverse sentence "+reversedSentence.trim() );

    }
}
