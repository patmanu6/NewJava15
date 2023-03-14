package C14StringsMethods;

public class Example4SplitMethod {
    public static void main(String[] args) {
        String str="Is Java easy? Is patrick a good programmer? why Usman never" +
                "speaks? Apple is good. Windows is better.";
        /*
        we can split based on multiple chars like ? . !
         */
        String[] sentences=str.split("[?.]");
        System.out.println(sentences.length);
        System.out.println(sentences[3]);
        System.out.println(sentences[3].trim());

    }
}
