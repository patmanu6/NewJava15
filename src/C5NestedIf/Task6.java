package C5NestedIf;

/*
 Create a boolean variable named isVacation and assign it a value of true or false.
    If isVacation is true, check if you have packed your bags using a nested if statement.
    If you have packed your bags, print a message saying "You are ready for your trip".
    If you haven't packed your bags, print a message saying "You should pack your bags before leaving".
    If isVacation is false, print a message saying "Enjoy your day at home!".
 */
public class Task6 {
    public static void main(String[] args) {
        boolean isVacation = true;
        boolean isBag = false;

        if (isVacation) {
            if (isBag) {
                System.out.println("You are ready for your trip");
            }
            else {
                System.out.println("You should pack your bag before leaving");
            }


        } else {
            System.out.println("Enjoy your day");
        }
    }
}
