package C2Variables;
/*
Task 4 :
Write a Java program that declares two integer variables,
 assigns them values, and prints the larger value.
 */
public class Task15PrintsLargerValues {
    void printLarge(){
        int a; int b;
        a=30; b=25;

        System.out.println(a*b);

    }
    public static void main(String[] args) {
        int value=50;
        int value2=100;
        if(value>value2){
            System.out.println(value+" is greater than "+value2);
        }else {
            System.out.println(value2+" is greater than "+value);
        }Task15PrintsLargerValues obj=new Task15PrintsLargerValues();



        obj.printLarge();// printing larger value using void method

    }
}
