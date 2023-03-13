package C13;

public class StringMethodDemo3 {
    public static void main(String[] args) {
//we are creating a variable of type String, and we are storing  Java is Fun" in it.
        String password="wieh";

        if(password.length()<8 || password.length()>16){
            System.out.println("Password can't be less than 8 characters or " +
                    "more than 16");
        }

    }
}
