package C15;

public class WhyWeNeedDataStructures {
    public static void main(String[] args) {

        String name1 = "Patrick";
        String name2 = "Usman";
        String name3 = "Sarah";
        String name4 = "Batyr";
        String[] names = {"Patrick", "Usman", "Sarah", "Batyr"};
        /*
        if we have to store single values going with variables is a
        good idea but if we have to store multiple values we should be using
        arrays
         */
        /*
        store the names of the students in the class in variables and
        print the values using a method

        return type=>void
        name printNames
        parameters=> String S
         body={
             System.out.println(name1);
             System.out.println(name2);
             System.out.println(name3);
             System.out.println(name4);
         }
         */
        WhyWeNeedDataStructures obj = new WhyWeNeedDataStructures();
        obj.printNames(name1, name2, name3, name4);
        obj.printArr(names);
    }

    void printNames(String name1, String name2, String name3, String name4) {

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }

    void printArr(String[] arr) {
        for (String name : arr
        ) {
            System.out.println(name);
        }
    }
}
