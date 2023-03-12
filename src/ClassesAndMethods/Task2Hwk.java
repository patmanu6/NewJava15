package ClassesAndMethods;
/*
 A method that takes no parameters and prints a message to the console:
 *****************************************************************************

    1)Define a method with the name printMessage and the
    return type void, since it doesn't return anything.
    2)Inside the method, use the System.out.println()
    method to print a message to the console.
 */
public class Task2Hwk {
    void printMessage(){System.out.println("I love FATIMA");}

    public static void main(String[] args) {
        Task2Hwk message=new Task2Hwk();
        message.printMessage();
    }

}
