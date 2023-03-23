package C16ArrayListLinkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        // 100K ArrayList 494
        // 5
        LinkedList<Integer> numbers=new LinkedList<>();
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);
        }
        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
