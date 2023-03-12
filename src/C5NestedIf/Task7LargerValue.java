package C5NestedIf;
/*
 Create two int variables named num1 and num2 and assign them any integer values.
    Check if num1 is greater than num2 using a simple if statement. If it is, print a message saying "num1 is greater than num2".
    If it is not, use a nested if statement to check if num2 is greater than num1. If it is, print a message saying "num2 is greater than num1".
    If neither of these conditions is true, print a message saying "num1 and num2 are equal".
 */
public class Task7LargerValue {
    public static void main(String[] args) {
        int num1=15;
        int num2=25;

        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }if(num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }else {
            System.out.println("they are equal");
        }

    }
}
