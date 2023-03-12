package ClassesAndMethods;

public class Examples4CallingOutVoidMethods {
    public static void main(String[] args) {

        Example3UsingVoidMethods obj = new Example3UsingVoidMethods();
        obj.add(3, 4);
        System.out.println();
        /*
        object is created first using the instance of that class. meaning the same class where the method was created.
        for example the class is called Example3usinVoidMethods, inside that class the Methods were created. To call that method
        use "that class name" to create an object(instance of the class) to call the methods.
        Remember voids has no return value so use sout to return what you wanted in your method.
         */
        obj.print();
        obj.printSomething("");
        obj.printManyTimes("Patrick",5);


    }
}
