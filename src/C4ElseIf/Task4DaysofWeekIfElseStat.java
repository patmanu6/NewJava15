package C4ElseIf;

/*
 Write a Java program that prints the name of the day of the week based on a given integer value.
  Step 1: Declare an integer variable named dayOfWeek.
  Step 2: Assign a value of 1 to the dayOfWeek variable.
  Step 3: Write an if statement that checks if the value of dayOfWeek is 1.
  Step 4: Inside the if statement, use the System.out.println() method to print the string "Monday".
  Step 5: Write an else if statement that checks if the value of dayOfWeek is 2.
  Step 6: Inside the else if statement, use the System.out.println() method to print the string "Tuesday".
  Step 7: Repeat steps 5 and 6 for the remaining days of the week (Wednesday, Thursday, Friday, Saturday, and Sunday), using the appropriate integer values and string names.
  Step 8: Write an else statement that executes if none of the previous conditions are true.
  Step 9: Inside the else statement, use the System.out.println() method to print the string "Invalid day of week".  Step 10: Save and run the program to see the output.
 */
public class Task4DaysofWeekIfElseStat {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        }
         else if(dayOfWeek == 2) {
            System.out.println("Tuesday");
        }
        else if (dayOfWeek == 3) {
            System.out.println("Wednesday");

        }else if (dayOfWeek == 4) {
            System.out.println("Thursday");

        }else if (dayOfWeek == 5) {
            System.out.println("Friday");

        }else if (dayOfWeek == 6) {
            System.out.println("Saturday");

        }else if (dayOfWeek == 7) {
            System.out.println("Sunday");

        }else {
            System.out.println("Invalid day of the week ");
        }
    }
}
