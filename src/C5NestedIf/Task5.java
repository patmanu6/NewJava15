package C5NestedIf;

/*
Create a boolean variable named isMorning and assign it a value of true or false.
    If isMorning is true, check if you have breakfast using a nested if statement.
    If you have breakfast, print a message saying "You are ready to start your day".
    If you don't have breakfast, print a message saying "You should eat something to start your day right".
    If isMorning is false, print a message saying "Enjoy your day!".
 */
public class Task5 {
    public static void main(String[] args) {
        boolean isMorning = false;
        boolean isBreakfast = true;

        if (isMorning) {

            if (isBreakfast) {
                System.out.println("You are ready to start your day");
            } else {
                System.out.println("You should eat something to start your day right");
            }


        } else {
            System.out.println("Enjoy your day!");
        }
    }
}
