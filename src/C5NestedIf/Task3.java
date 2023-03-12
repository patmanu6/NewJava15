package C5NestedIf;

/*Create a boolean variable named isHungry and assign it a value of true or false.
        If isHungry is true, check if it's morning or evening using a nested if statement.
        If it's morning, print a message saying "You should eat breakfast to start your day right".
        If it's evening, print a message saying "You should eat dinner to end your day on a good note".
        If isHungry is false, print a message saying "You are not hungry, enjoy your day!"*/
public class Task3 {
    public static void main(String[] args) {
        boolean isHungry = false;
        boolean isMorning = true;
        boolean isEvening = false;

        if (isHungry) {

            if (isMorning) {
                System.out.println("You should eat breakfast to start your day");
            }
            if (isEvening) {
                System.out.println("You should eat dinner");

            }
        } else {
            System.out.println("You are not hungry enjoy your day");
        }
    }
}
