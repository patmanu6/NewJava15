package C10ArraysAndScanner;

public class EnhancedForLoop1 {
    public static void main(String[] args) {
        int[] arr={10,20,45,50};
        /*
        Enhanced for loop is the most easy and readable loop, but it also has
        its limitation for example we can't print the numbers in reverse order
        we can only print the elements we can't even update them
         */
        for(int x:arr){
            if(x==10){
                System.out.println(x);
            }

        }
    }
}
