package C12;

public class HWTask3 {
    /*
    Task3:
    A method that takes a single parameter and doubles it:
    1)Define a method with the name doubleNumber that takes an integer parameter: int number.
    Inside the method, multiply the number parameter by 2 and return the result
    using the return keyword.
     */

    int doubleNumber(int num){

        return num*2;
    }

    public static void main(String[] args) {
        HWTask3 obj=new HWTask3();
        int num=3;
        System.out.println(obj.doubleNumber(3));
    }
}
