package C12;
/*
Task2:
    A method that takes an array of integers and returns the largest number:
    1)Define a method with the name findLargest that takes an integer array parameter: int[] numbers.
    2)Inside the method, initialize a variable largest to the first element of the array.
    3)Use a loop to compare each element of the array with the largest variable, and update it if the current element is larger.
    4)Return the largest variable using the return keyword.

    return type>int
    method name> findLargest
    parameters > array of int.
    body{if condition }, initialize variable largest to first element
 */
public class HWTask9 {
    int findLargest(int[]number){
        int Largest=number[0];
        for (int i = 0; i < number.length; i++) {

          if(number[i]>Largest){
              Largest=number[i];
          }
        }return Largest;
    }

    public static void main(String[] args) {
        HWTask9 obj=new HWTask9();
        int []number={0,5,2,55,900};
        System.out.println(obj.findLargest(number));
    }
}
