package C12;
/*
create a method to add all the elements.return the value of the total element.Using enhanced loop
 */
public class Task1b {
    int addNumbers(int[] arr){
        int add=0;
        for (int i:arr) {
            add+=i;

        }
     return add;
    }

    public static void main(String[] args) {
        Task1b obj=new Task1b();
        int []numbers={1,2,3};
        System.out.println(obj.addNumbers(numbers));
    }
}
