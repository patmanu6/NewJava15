package ClassesAndMethods;
/*
  A method that takes two numbers and returns the larger number:
  **********************************************************************************
    1)Define a method with the name max that takes two integer parameters: int a and int b.
    2)Inside the method, use an if else operator to return the larger number of the two parameters.
Task5:
    A method that takes an array of integers and returns the sum of all the numbers in the array:
 */
public class Task4Hwk {
    int max(int a, int b){if(a>b) return a; else return b;}

    public static void main(String[] args) {
        Task4Hwk obj=new Task4Hwk();
        int num=obj .max(3,8);
        System.out.println(num);
    }

}
