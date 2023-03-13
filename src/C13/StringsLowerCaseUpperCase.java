package C13;

public class StringsLowerCaseUpperCase {
    public static void main(String[] args) {
        String str="Bat was in a party before the class 123#$%";
        String upperCaseStr=str.toUpperCase();
        System.out.println(upperCaseStr);
        String str2="ALL IS IN UPPERCASE";
        String lowerCaseStr2=str2.toLowerCase();
        System.out.println(lowerCaseStr2);

        String firstName="Aladin";
        String lastName="dictator";
        boolean areEqual= firstName.equals(lastName);
        System.out.println(areEqual);
    }
}
