package C15;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Patrick");
        names.add("batyr");
        names.add("Sarah");
        names.add("Usman");

        System.out.println(names.get(0));
        System.out.println(names.get(3));
        System.out.println(names.size());
        System.out.println("************");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
