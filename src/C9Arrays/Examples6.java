package C9Arrays;

public class Examples6 {
    public static void main(String[] args) {

        int [] numbers={10,20,20,10};

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }
        System.out.println(sum);
    }
}
