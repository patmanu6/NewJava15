package ClassesAndMethods;

public class Examples5ofReturnMethods {
    String printMyname(String str ){return "Hi Mr.Manu, "+str;}

    String printingRadom(String str2){return "I wanna take you out "+str2;}


    /*
    This method is a String return type.
    Print as the name of the method.
    "return" key word  as the statement use to return something from the method.
     */

    public static void main(String[] args) {
        Examples5ofReturnMethods obj=new Examples5ofReturnMethods();

     String str= obj.printMyname("you are awesome");
        System.out.println(str);

        String str2=obj.printingRadom("I am living to Uk");
        System.out.println(str2);

    }
}
