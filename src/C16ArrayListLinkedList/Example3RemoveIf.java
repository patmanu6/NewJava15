package C16ArrayListLinkedList;

import java.util.ArrayList;

/*
ArrayList<String> names=new  ArrayList<>();
        names.add("Pat");
        names.add("Pat");
        names.add("Pat");
        names.add("Pat");
        names.add("Sarah");
        names.add("Usman");
        names.add("Bat");
        // Remove duplicates
 */
public class Example3RemoveIf {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("pat");
        names.add("pat");
        names.add("pat");
        names.add("sarh");
        names.add("Bat");
        names.removeIf(x->x.contains("pat"));
        System.out.println(names);


    }
}
