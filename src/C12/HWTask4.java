package C12;

public class HWTask4 {
    /*
    Task4:
    A method that takes two numbers and returns the larger number:
    1)Define a method with the name max that takes two integer parameters: int a and int b.
    2)Inside the method, use an if else operator to return the larger number of the two parameters.

     */
  // return type==int
  //  method name ==max;
    //Parameters(int a, int b)
    //body{
    // if(a>b){
    //return a;
  //  }else{
    //return B;

    int max(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        HWTask4 obj=new HWTask4();
        System.out.println(obj.max(7,8));
    }
        }


