package C12;
/*
Task6:
    A method that takes an integer and returns true if the number is even, false if it is odd:
    Define a method with the name isEven that takes an integer parameter: int number.
    Inside the method, use the modulo operator to check if the number is even
 */
public class HWTask6 {
    boolean isEven(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        HWTask6 obj=new HWTask6();
        System.out.println(obj.isEven(13));
    }
}
