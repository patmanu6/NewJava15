package C17SetsAndMaps;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Orange");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Banana");
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
