package C14StringsMethods;
/*
Task:Declare a string variable named str and assign it the value "Java is a programming language".
     Call the replace() method on the str variable and pass two arguments: "Java" as the substring to be replaced,
      and "Python" as the replacement string. Store the result in a new string variable named newStr.
     Print the original str string with the message "Original string: " using the System.out.println() method.
     Print the new newStr string with the message "New string: " using the System.out.println() method

 */
public class Task3 {
    public static void main(String[] args) {
        String str="Java is a programing language";
       String newStr=str.replace("Java","python");

      //  String newStr="Python is a programing language";
        System.out.println("Original String "+str);

        System.out.println("New string "+newStr);

    }
}
