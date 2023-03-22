package C12;

public class HWTask7 {
    /*
    Task7:
    A method that takes an array of strings and returns the concatenated string:
    1)Define a method with the name concatenate that takes a string array parameter: String[] arr.
    2)Inside the method, initialize a variable result to an empty string.
    3)Use a loop to concatenate each element of the array to the result variable.
    4)Return the result variable using the return keyword.
     */
    /*
    return type> String
    Method name> concatenate
    Parameters> String[]arr
    Body{
    String result="";

    for(int i=0; i<arr.length;i++){
    result+=arr[i];

    }return result;
     */


    String concatenate(String[]arr){
        String result=" ";
        for (int i=0; i<arr.length;i++){
            result+=arr[i]+" ";
        }return result;
    }

    public static void main(String[] args) {
        HWTask7 obj=new HWTask7();
        String[]arr={"she","is","gone"};
        System.out.println(obj.concatenate(arr));
    }
}
