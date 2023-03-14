package C14StringsMethods;

public class Example2toCharArray {
    public static void main(String[] args) {
        String str="patrick";
      /*
      toCharArray() it will convert a String to an array of characters
      that we can treat just like we were treating arrays
       */

        // we can manipulate individual chars like they are stored in an array
        char [] strArr=str.toCharArray();
        // char [] strArr={'p','a','t','i','c','k'}
        System.out.println(strArr.length);
        System.out.println(strArr[2]);
        //print all the characters from array strArr using a loop
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

    }
}
