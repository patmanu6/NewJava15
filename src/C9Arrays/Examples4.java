package C9Arrays;

public class Examples4 {
    public static void main(String[] args) {
        int [] numbers={10,20,45,67};
        // print all the elements from this array with the help of a
        // while loop in reverse order
        int num=0;
        while (num<numbers.length){
            System.out.println(numbers[num]);
            num++;
        }

    }
}
