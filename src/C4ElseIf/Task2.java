package C4ElseIf;
/*
Simple Calculator:
    Declare two variables num1 and num2 and assign them values of 5 and 10 respectively.
    Declare a third variable operator and assign it the value "+".
    Write an if statement that checks if the operator variable is equal to "+".
    If the condition is true, print the sum of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "-".
    If the condition is true, print the difference of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "*".
    If the condition is true, print the product of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "/".
    If the condition is true, print the quotient of num1 and num2 to the console.
    Write an else statement that prints "Invalid operator" to the console if none of the above conditions are true.
 */
public class Task2 {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        char operator='-';

        if(operator=='*'){
            System.out.println("The sum of num ="+num1+operator+num2);
        } else if (operator=='-') {
            System.out.println("The difference of number = "+num1+operator+num2);
        } else if (operator=='*') {
            System.out.println("The multiplication of number = "+num1+operator+num2);
        } else if (operator=='/') {
            System.out.println("The quotient of number ="+num1+operator+num2);
        }else {
            System.out.println("Invalid");
        }

    }
}
