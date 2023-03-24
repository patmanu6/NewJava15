package C15;

public class ArrayList {
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
        java.util.ArrayList<Integer> obj=new java.util.ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(40);

        System.out.println(obj);
    }
}
