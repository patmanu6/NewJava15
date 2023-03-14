package C14StringsMethods;

public class Example3 {
    public static void main(String[] args) {
        String str="Today is Monday. We have a java class. Sarah is not here";
        // Split method
        String [] sentences=str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[0]);
        System.out.println(sentences[2].trim());
        /*
        splitting again based on spaces which will give us an array
        of individual words as there are 4 words size of the array will be 4
         */
        String[] words=sentences[2].trim().split(" ");
        System.out.println(words.length);
        System.out.println(words[0]);
    }
}
