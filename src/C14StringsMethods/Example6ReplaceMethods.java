package C14StringsMethods;

public class Example6ReplaceMethods {
    public static void main(String[] args) {
        String str="@#%$^SDFHSFBJEFB#&fejdfjdfbz586";
        // replace all the lowercase letters from a to z with *
        String newStr=str.replaceAll("[a-z]","*");
        System.out.println(newStr);
        // replace all the lowercase letters from A to Z with %
        System.out.println(str.replaceAll("[A-Z]","%"));
        System.out.println(str.replaceAll("[0-9]","+"));
// replace all the lowercase letters from a to k with *
        System.out.println(str.replaceAll("[a-k]","*"));
        System.out.println(str.replaceAll("[A-G]","@"));
        System.out.println(str.replaceAll("[A-Za-z]","@"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","@"));
        // removes all Upper case lower case and number
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        // remove everything which is no lowercase a-z it's similar to ! symbol in java
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        //how to remove all special characters
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        String str3="s";

    }

}
