package C12;

public class HWTask8 {
    /*
    Task8:
    A method that takes an array of integers and returns the sum of all the even numbers in the array:
    1)Define a method with the name sumEven that takes an integer array parameter: int[] arr.
    2)Inside the method, initialize a variable sum to 0.
    3)Use a loop to iterate through the elements of the array and add the value of each even element to sum.
    4)Return the value of sum.
     */
    int sumEven(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }return sum;


}

    public static void main(String[] args) {
        HWTask8 obj=new HWTask8();
        int[] arr={1,2,3,6};
        System.out.println(obj.sumEven(arr));
    }
}
