package C15;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
  /*
        Creating the object of ArrayList class
        <> Are used to specify the datatype
        we can't use primitive datatype with ArrayList class
        int=>Integer
        double=> Double
        char=> Character
        boolean=>Boolean
        float=> Float
        byte=>Byte
        short=>Short
        long=> Long
         */
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(40);

        System.out.println(obj);
    }
}
