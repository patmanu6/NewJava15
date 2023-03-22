package C12;

public class HWTask10 {
    /*
     A method that takes a string and a character, and counts the number of occurrences of that character in the string:
    1)Define a method with the name countChar that takes two parameters: a string parameter
    str and a character parameter ch.
    Initialize a variable count to 0.
    2)Use a loop to iterate through each character of the string,
    and check if it's equal to the ch parameter. If it is, increment the count variable.
    3)Return the count variable using the return keyword.
     */

    /*
    return type>> int
    method name>> countChar
    parameter>> String,char(str,ch)
    int count=0;


    for(int i=0; i<str.length;i++){
   if(str.charAt[i]==ch){
   count++;}

return count;
     */
   /* public static void main(String[] args) {
        HWTask10 obj=new HWTask10();
        String str="My neice is annoying";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
        if(str.charAt[i]==ch){
   count++;}
    */
          int countChar(String str, char ch){
             int count =0;
              for (int i = 0; i <str.length() ; i++) {
                 if(str.charAt(i)==ch){
                     count++;
                 }
              }return count;
          }

    public static void main(String[] args) {
        HWTask10 obj=new HWTask10();
        String str="My neice is annoying";
        char ch='i';
        System.out.println(obj.countChar(str,ch));
    }

    }

