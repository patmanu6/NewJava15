package C5NestedIf;

public class Example1 {
    public static void main(String[] args) {

        int age = 19;
        boolean citizen = false;
        if (age >= 18) {

            if (citizen) {
                System.out.println("You are allowed to vote");
            } else {
                System.out.println("You need to be a citizen as well");
            }

        } else {
            System.out.println("You need to be 18 to vote");
        }

        System.out.println("Program ends");
    }
}
