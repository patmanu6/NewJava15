package C13;

public class StringMethodDemo2 {
    public static void main(String[] args) {
        //we are creating a variable of type String, and we are storing  Java is Fun" in it.
        String str=" Java is Fun";
        /*
        we are creating a variable of type int and call the length method from String class
        which will return the number of characters which are present in str variable
         */
        int len=str.length();
        // printing the value of len variable
        System.out.println(len);

        StringMethodDemo2 d=new StringMethodDemo2();
        d.print();
    }

    /**
     * this method will print Apple
     */
    void print(){
        System.out.println("Apple");
    }
}

