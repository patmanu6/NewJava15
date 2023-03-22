package C12;
/*
 Create a method which should return a boolean
    Name of the method should be "isPalindrome"
    Parameters to the method should be a string
    Inside the body of the method you should write a loop that checks if the string is a palindrome or not, and return the result.
    Call this method and test it
 */
public class Task2 {
    boolean isPalindrome(String str) {
    /*
    Creating a variable to hold the reversed String
     */
        String reveresedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            /*
            using charAt to collect chars writing a reverse
            loop
             */
         reveresedStr+=  str.charAt(i);
        }
        /*
        if original String is same as reversed one it means
        it's a Palindrome
         */
        if(str.equals(reveresedStr)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        System.out.println(obj.isPalindrome("gaga"));
    }
}

