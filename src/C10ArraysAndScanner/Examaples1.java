package C10ArraysAndScanner;

public class Examaples1 {
    public static void main(String[] args) {
        // Creating and initializing the array
        int [] arr={10,20,30};
        /*
        below we have created an array of ints we are
        calling it as numbers and its size is 5
         */
        int [] numbers=new int[5];
        // accessing the first locations on index 0 and assigning 10 to it
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=40;
        numbers[3]=55;
        numbers[4]=67;
// we are printing all the elements using an array
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
    }
}}
