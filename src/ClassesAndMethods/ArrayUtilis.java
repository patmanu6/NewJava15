package ClassesAndMethods;

/*
Declare an integer array and initialize it with values.
Create a for loop that will iterate over each element in the array.
Within the for loop, use the current index to access the current element's value.
Print out a message that displays the index and value of the current element.
After the message has been printed, the for loop will move on to the next element in the array and repeat the process until all elements have been printed

 */
public class ArrayUtilis {


/*/*
Declare an integer array and initialize it with values.
Create a for loop that will iterate over each element in the array.
Within the for loop, use the current index to access the current element's value.
Print out a message that displays the index and value of the current element.
After the message has been printed, the for loop will move on to the next element in the array and repeat the process until all elements have been printed

 */

    void printIndexAndValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The index of the element " + i + " and the value is " + array[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr={10,15,20,30};
        ArrayUtilis obj=new ArrayUtilis();
        obj .printIndexAndValue(arr);


    }
}

