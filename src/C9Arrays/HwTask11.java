package C9Arrays;
/*
Create an integer array with 7 elements and fill it with random
values between 1 and 20. Use a while loop to iterate over the array
and print out all the values that are odd and greater than 10.
 */
public class HwTask11 {
    public static void main(String[] args) {
        int []array={1,2,4,3,8,7,3};
        int i=0;
        while (i<array.length){
           if(array[i]%2==1){
               System.out.println(array[i]);

           }
          i++;
        }
    }
}
