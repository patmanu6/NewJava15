package C6LogicalOperators;
/*
Declare three variables, isWeekend, isHoliday, and temperature, and assign them boolean and integer values, respectively. Write an if statement
    that checks whether it's either the weekend OR a holiday AND the temperature is greater than or equal to 80 degrees. If the condition is true,
    print "It's a great day for a picnic" to the console. Otherwise, print "It's either not a good day for a picnic or not warm enough" to the console.
 */
public class Task3NeedsAtten {
    public static void main(String[] args) {
        boolean isWeekend=true;
        boolean isHoliday=false;
        int temp=15;

        if(isWeekend||isHoliday&&temp>80){
            System.out.println("It is a great day for picnic");

        }else {
            System.out.println("Its not a good day for picnic");
        }

    }
}
