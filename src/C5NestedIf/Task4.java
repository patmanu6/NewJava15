package C5NestedIf;
/*
Create a boolean variable named isWeekend and assign it a value of true or false.
    If isWeekend is true, check if the weather is good using a nested if statement.
    If it's good, print a message saying "You should plan an outdoor activity and enjoy your day".
    If it's not good, print a message saying "You can still plan an indoor activity and have fun with your family and friends".
    If isWeekend is false, print a message saying "You need to work hard during weekdays to enjoy your weekends".
 */
public class Task4 {
    public static void main(String[] args) {
        boolean isWeekend=true;
        String Weather="good";


        if(isWeekend){
            if(Weather.equalsIgnoreCase("bad")){
                System.out.println("You should plan outdoor activity and enjoy your day");
            }else {
                System.out.println("You can still plan an indoor activity and have fun with your family and friends");
            }
        }else {
            System.out.println("You need to work hard during weekdays to enjoy your weekends");
        }
    }
}
