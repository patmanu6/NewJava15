package C6LogicalOperators;
/*
 Create a double variable named temperature and assign it a value between -50 and 50.
    If temperature is less than 0, print a message saying "It's freezing outside".
    If temperature is between 0 and 20, print a message saying "It's chilly outside".
    If temperature is between 20 and 30, print a message saying "It's comfortable outside".
    If temperature is greater than 30, print a message saying "It's hot outside".

 */

public class Task5 {
    public static void main(String[] args) {
        int temperature = 0;
        if (temperature <= 0) {
            System.out.println("It is freezing");
        }
        if (temperature > 0 && temperature < 20) {
            System.out.println("its chilly");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("Its comfortable");
        } else if (temperature > 30) {
            System.out.println("Its too hot");

        }
    }
}
