package C14StringsMethods;

public class Example5 {
    public static void main(String[] args) {
        String str="Patrick looks energetic today";
        /*
        first parameter is from where we want to start grabbing the characters
        second parameter is till where we want the characters
        note
        first parameter is inclusive second is exclusive
         */
        String subStr=str.substring(8,13);
        System.out.println(subStr);
        System.out.println(str.substring(14,24));
        /*
        when ever we have to print
        "" we have to use \ when we put \ before "
        java treats it as literal
         */
        String str2="Name is \"Patrick\"";
        System.out.println(str2);
    }
}
