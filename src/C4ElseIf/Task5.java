package C4ElseIf;
/*
 Task: Write a Java program that prints the name of the month based on a given integer value.

   Step 1: Declare an integer variable named month.
   Step 2: Assign a value of 1 to the month variable.
   Step 3: Write an if statement that checks if the value of month is 1.
   Step 4: Inside the if statement, use the System.out.println() method to print the string "January".
   Step 5: Write an else if statement that checks if the value of month is 2.
   Step 6: Inside the else if statement, use the System.out.println() method to print the string "February".
   Step 7: Repeat steps 5 and 6 for the remaining months of the year (March through December), using the appropriate integer values and string names.
   Step 8: Write an else statement that executes if none of the previous conditions are true.
   Step 9: Inside the else statement, use the System.out.println() method to print the string "Invalid month".
   Step 10: Save and run the program to see the output.

 */
public class Task5 {
    public static void main(String[] args) {
        int month=12;

        if(month==1){
            System.out.println("January");
        } else if (month==2) {
            System.out.println("February");
        }else if (month==3) {
            System.out.println("March");
        }else if (month==4) {
            System.out.println("April");
        }else if (month==5) {
            System.out.println("May");
        }else if (month==6) {
            System.out.println("June");
        }else if (month==7) {
            System.out.println("July");
        }else if (month==8) {
            System.out.println("August");
        }else if (month==9) {
            System.out.println("September");
        }else if (month==10) {
            System.out.println("October");
        }else if (month==11) {
            System.out.println("November");
        }else if (month==12) {
            System.out.println("December");
        }else {
            System.out.println("Invalid month");
        }

    }
}
