package C12;

public class HWTask1 {
    /*Task1:
  Task1:
    1)Define a method with the name add that takes two
     integer parameters: int num1 and int num2.
    2)Inside the method, add the two numbers and store the result in a new variable.
    3)Return the result using the return keyword.

  */

    int add(int num1, int num2){
        int sum=num1+num2;

        return sum;

    }

    public static void main(String[] args) {
        HWTask1 obj=new HWTask1();
        System.out.println(obj.add(3,5));
    }

}
