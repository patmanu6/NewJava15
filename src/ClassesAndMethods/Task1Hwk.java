package ClassesAndMethods;
/*
 1)Define a method with the name add that takes two
 *********************************************************************************
     integer parameters: int num1 and int num2.
    2)Inside the method, add the two numbers and store the result in a new variable.
    3)Return the result using the return keyword.
 */
public class Task1Hwk {
    int add(int num1, int num2){return num1+num2;}

    public static void main(String[] args) {
        Task1Hwk obj=new Task1Hwk();

       int num= obj .add(3,5);
        System.out.println(num);


    }


}
