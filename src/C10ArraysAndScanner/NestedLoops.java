package C10ArraysAndScanner;

public class NestedLoops {
    public static void main(String[] args) {
 /*
        Nested loops
       one loop inside another loop same as nested if conditions
         */
    /*    for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
*/
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
