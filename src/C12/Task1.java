package C12;
/*
Create a method which should return an int
     Name of the method should be "add"
     Parameters to the methods should be an array of ints
     Inside the body of the method you should write a loop
    that adds all the elements from the array and return the results
    Call this method and test it
 */
public class Task1 {
        int add(int [] arr){
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            return sum;  }

    public static void main(String[] args) {
            int []arry={1,2,3};
        Task1 obj=new Task1();

        System.out.println(obj.add(arry));
    }

    }

