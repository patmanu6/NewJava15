package C9Arrays;

public class EnhancedFoorloop {
    public static void main(String[] args) {
        int [] arr={10,30,45,20,45};
        int sum=0;
        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
