package C15;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Patrick");
        names.add("batyr");
        names.add("Sarah");
        names.add("Usman");
        /*
        Equivalent of length method
         */
        System.out.println(names.size());
        System.out.println(names);
    }

}
