package C12;
/*
Task5:
    A method that takes an array of integers and returns the sum of all the numbers in the array:
    1)Define a method with the name sum that takes an integer array parameter: int[] arr.
    2)Inside the method, initialize a variable sum to 0.
    3)Use a loop to add up each element of the array to the sum variable.
    4)Return the sum variable using the return keyword.
 */
public class HWTask5 {
    int sum(int []arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }return sum;

    }

    public static void main(String[] args) {
        HWTask5 obj=new HWTask5();
        int[]arr={1,2,3};
        System.out.println(obj.sum(arr));
    }
}
