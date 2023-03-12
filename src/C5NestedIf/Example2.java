package C5NestedIf;

public class Example2 {
    public static void main(String[] args) {

        int age=19;
        boolean membership=false;
        if(age<18){
            System.out.println("you are too young to get a discount");
        }else {

            System.out.println("Inside the else block");
            if(membership){
                System.out.println("you get a discount");
            }else {
                System.out.println("you must be a member");
            }
            System.out.println("You are an adult");
        }

        System.out.println("Program ends");
    }
}
