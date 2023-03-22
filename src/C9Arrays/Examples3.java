package C9Arrays;

public class Examples3 {
    public static void main(String[] args) {

        int [] numbers={10,20,45,67};
        // print all the elements from this array with the help of a
        // while loop
        int num=0;
        while (num<numbers.length){
            System.out.println(numbers[num]);
            num++;
        }
        System.out.println();

int [] values={20,30,40};
        //print out values in array using while loop.

        int k=0;
        while (k< values.length){
            if(values[1]==values[k])
            System.out.println(values[k]);
            k++;
        }

    }
}
