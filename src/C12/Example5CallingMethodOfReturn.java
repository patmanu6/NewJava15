package C12;

public class Example5CallingMethodOfReturn {
    public static void main(String[] args) {

       /* Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        Example4 obj=new Example4();
      //  String str2=obj.print();]*/
        Example6CreatingMethodReturnKeyWord obj=new Example6CreatingMethodReturnKeyWord();
        String  str=obj.print("Patrick");
        System.out.println(str);
    }
}
