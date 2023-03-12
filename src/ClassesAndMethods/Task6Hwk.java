package ClassesAndMethods;

/*Task6:
    A method that takes an integer and returns true if the number is even, false if it is odd:
    *************************************************************************************
    Define a method with the name isEven that takes an integer parameter: int number.
    Inside the method, use the modulo operator to check if the number is even

 */
public class Task6Hwk {
    int isEven(int num) {
        if (num % 2 == 0) {
        return num;
        }else {
        return num;}
    }

    public static void main(String[] args) {
        Task6Hwk obj=new Task6Hwk();
        int num= obj.isEven(9);
        System.out.println(num);

    }
}
