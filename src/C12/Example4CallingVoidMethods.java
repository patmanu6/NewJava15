package C12;

public class Example4CallingVoidMethods {
    public static void main(String[] args) {
        Example3CreatingMethodOfPublic obj=new Example3CreatingMethodOfPublic();
        obj.add(3,5);
        obj.print();
        obj.print();
        obj.printWord("I love you");
        obj.printWordManyTimes("Hey",5);

    }
}
