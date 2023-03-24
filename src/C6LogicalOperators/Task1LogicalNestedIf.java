package C6LogicalOperators;

/*
Declare three boolean variables, isHungry, isTired, and isStudying, and assign them any boolean values.
    Write an if statement that checks if both isHungry and isTired are true, and print a message to the console indicating that the person needs to eat and sleep.
    Write another if statement that checks if isStudying is false and either isHungry or isTired is true, and print a message to the console indicating that the
    person should take a break.
 */
public class Task1LogicalNestedIf {
    public static void main(String[] args) {
        boolean isHungry = false;
        boolean isTired = false;
        boolean isStudying = true;

        if (isHungry && isTired) {
            System.out.println("You need to eat");
        } else {
            System.out.println("Take a nap");
        }
        if (isStudying || isTired) {
            System.out.println("Take a break");
        } else {
            System.out.println("You can do whatever you want");
        }

    }
}
