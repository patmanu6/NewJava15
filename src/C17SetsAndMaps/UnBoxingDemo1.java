package C17SetsAndMaps;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnBoxingDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new  ArrayList<>();
        names.add("Pat");
        names.add("Pat");
        names.add("Pat");
        names.add("Pat");
        names.add("Sarah");
        names.add("Usman");
        names.add("Bat");
        /*
        taking an arrayList as input and creating a set out of it
         */
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(names);
        /*
        below line will create an arrayList from a set without duplicates
         */
        names =new ArrayList<>(linkedHashSet);
        System.out.println(names);
    }
}
