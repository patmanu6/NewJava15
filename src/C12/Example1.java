package C12;

public class Example1 {
    public static void main(String[] args) {
        int[] arr={10,20,450,45,67,89,90};
        //TODO write a loop to print the elements of this array

        int[] arr2={1,44,450,-1,1000,99,90};
        //TODO write a loop to print the elements of this array

        int[] arr3={5 ,5,6,7,8,9,9,7,43,};
        //TODO write a loop to print the elements of this array

        int[] arr4={13,4,5,6,2,3,45,6,4,3};
        //TODO write a loop to print the elements of this array

        Printer printerObj=new Printer();
        printerObj.printArray(arr);
        printerObj.printArray(arr2);
        printerObj.printArray(arr3);
        printerObj.printArray(arr4);

    }
}
