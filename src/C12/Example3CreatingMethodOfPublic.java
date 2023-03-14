package C12;

public class Example3CreatingMethodOfPublic {
    public   void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void print(){
        System.out.println("Hello World");
    }
    void printWord(String str){
        System.out.println(str);
    }
    void printManyTimes(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello Java");
        }
    }

    void printWordManyTimes(String str,int num){ //syntax creating void method, void keyword(), method name, pass some parameters(datatype,for example strings or integers or boolean)
        //curly bracket and sout statements.

        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
}}
