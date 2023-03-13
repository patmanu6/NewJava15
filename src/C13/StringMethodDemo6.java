package C13;

public class StringMethodDemo6 {
    public static void main(String[] args) {
        String name="Patrick looks sad today";

        //  name=name.toLowerCase();
        //Method chaining calling multiple methods on the same line
        boolean isPresent= name.toLowerCase().contains("patrick");
        System.out.println(isPresent);

    }
}
