package C13;

public class StringMethodDemo7 {
    public static void main(String[] args) {
        String name=" looks sad today. patrick is happy now";

        //  name=name.toLowerCase();
        //Method chaining calling multiple methods on the same line
        //
        boolean isPresent= name.toLowerCase().startsWith("patrick");
        System.out.println(isPresent);
        System.out.println(name.endsWith("now"));

    }

}
