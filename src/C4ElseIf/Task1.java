package C4ElseIf;
/*
Simple Grade Calculator
    Declare a variable score and assign it a value of 85.
    Write an if statement that checks if the score variable is greater than or equal to 90.
    If the condition is true, print "A" to the console.
    Write an else if statement that checks if the score variable is greater than or equal to 80.
    If the condition is true, print "B" to the console.
    Write an else if statement that checks if the score variable is greater than or equal to 70.
    If the condition is true, print "C" to the console.
    Write an else if statement that checks if the score variable is greater than or equal to 60.
    If the condition is true, print "D" to the console.
    Write an else statement that prints "F" to the console if none of the above conditions are true
 */
public class Task1 {
    public static void main(String[] args) {
        int score=85;
        if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
