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

 int [] values={20,30,10};
        int k=0;
        while (k<values.length){
            if(values[1]==values[k]){
                System.out.println(values[k]);
            }
        }

        }
    }

