package C10ArraysAndScanner;

public class DoWhileLoop {
    public static void main(String[] args) {

            int number = 5;
     /*   while (10<number){
            System.out.println("While loop");
        }
*/

            // DO part is executed first that's why even the condition is false
            // we will see the output at least once
            do {
                System.out.println("Do while loop");
            } while (10 < number);

        }
}
