package C14StringsMethods;
/*
Task:toCharArray()
    Declare a string variable and assign it a value.
    Call the toCharArray() method on the string variable.
    Store the result in a character array variable.
    Iterate through the character array using a loop and print each character.
 */
public class Task1 {
    public static void main(String[] args) {
        String str="I am in Love with Amina";
        char []arr=str.toCharArray();
        System.out.println(arr.length);
       // char[] character={'I','a','m','i','n','l','o','v','e','w','i','t','h','A','m','i','n','a'};

        for (char c : arr) {
            System.out.println(c);

        }
    }

}

