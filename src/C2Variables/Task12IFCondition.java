package C2Variables;
/*
create an int variable call is age store 16 in it
then write an if condition which checks if age is greater than 18 print
"you are allowed to vote" otherwise print you are too young to vote

 */
public class Task12IFCondition {
    public static void main(String[] args) {

        int age=16;
        if(age>=18){
            System.out.println("You are allowed to vote");
        }else {
            System.out.println("Sorry you can't vote");
        }
    }
}
