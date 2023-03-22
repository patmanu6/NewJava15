package C12;
/*
create a method to add all the elements.return the value of the total element.Using enhanced loop

 */
public class Task1a {
    int addTotal(int[] num){
        int total=0;
        for (int i = 0; i <num.length ; i++) {
            total+=num[i];

        }return total;
    }

    public static void main(String[] args) {
        Task1a obj=new Task1a();
        int []numbers={1,2,3};
        System.out.println(obj.addTotal(numbers));
    }
}
