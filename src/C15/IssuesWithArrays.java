package C15;

public class IssuesWithArrays {
    public static void main(String[] args) {
        // we can only store three elements in this array
        // by using index 0,1,2
        int [] numbers=new int[4];
        /*
        numbers is the name of the array
        [0] is how we tell java that we want to access the index 0
        =10 by writing this part java will store the number 10 on
        index 0
         */
        numbers[0]=10;
        numbers[1]=34;
        numbers[2]=60;
        numbers[3]=70;

    }
}
