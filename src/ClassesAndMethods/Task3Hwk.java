package ClassesAndMethods;

/*

Task3:
    A method that takes a single parameter and doubles it:
    **********************************************************************
    1)Define a method with the name doubleNumber that takes an integer parameter: int number.
    Inside the method, multiply the number parameter by 2 and return the result
    using the return keyword.

 */
public class Task3Hwk {
    int doubleNumber(int num){return num*2;}

    public static void main(String[] args) {
        Task3Hwk obj=new Task3Hwk();
        int number= obj.doubleNumber(5);
        System.out.println(number);
    }


}



