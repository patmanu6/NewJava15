package C6LogicalOperators;

/*
Write a program for a movie theater that determines whether a customer qualifies for a discount based on
    their age and whether they are a student or a senior. If the customer is either a student or a senior, and
    their age is less than or equal to 18 or greater than or equal to 60, then they qualify for a discount.
 */
public class Task6 {
    public static void main(String[] args) {
        int age = 17;
        boolean isStudent = false;
        boolean isSenior = false;

        if(isStudent||isSenior){
            System.out.println("You are qualify for discount");
        } else if (age>=18||age>65) {
            System.out.println("You can get a discount");

        }else {
            System.out.println("You need to be student or senior to qualify");
        }

    }}
