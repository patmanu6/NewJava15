package ClassesAndMethods;
/*
 int[] arr={10,20,450,45,67,89,90};
        //TODO write a loop to print the largest number from above array

        int[] arr2={1,44,450,-1,1000,99,90};
        //TODO write a loop to print the largest number from above array

        int[] arr3={5 ,5,6,7,8,9,9,7,43,};
        //TODO write a loop to print the largest number from above array

        int[] arr4={13,4,5,6,2,3,45,6,4,3};
        //TODO write a loop to print the largest number from above array
 */
public class Example2ToPrintLargestArrays {
    public static void main(String[] args) {
        int[] arr={10,20,450,45,67,89,90};
        int largest=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println(largest);


        int[] arr2={1,44,450,-1,1000,99,90};
        int largest2=0;
        for (int i = 0; i <arr2.length; i++) {
            if(arr2[i]>largest2){
                largest2=arr2[i];

            }

        }
        System.out.println(largest2);


        int[] arr3={5 ,5,6,7,8,9,9,7,43,};
        int large=0;
        for (int i = 0; i < arr3.length; i++) {

            if(arr3[i]>large){
                large=arr3[i];

            }

        }
        System.out.println(large);

        int[] arr4={13,4,5,6,2,3,45,6,4,3};
        int greatest=0;
        for (int i = 0; i <arr3.length; i++) {

            if(arr3[i]>greatest){
                greatest=arr3[i];
            }

        }
        System.out.println(greatest);



    }
}
