package C5NestedIf;
/*
 Create a variable isRaining and set it to true.
 Create a variable isCold and set it to false.
 Create an if statement that checks if isRaining is true. If it is,
 print "Remember to bring an umbrella". If it isn't,
 Add a  nested if statement inside the else part that checks if isCold is true.
 If it is, print Also "bring a jacket".
 */
public class Task1 {
    public static void main(String[] args) {

        boolean isRaining=false;
        boolean isCold=false;

        if(isRaining){
            System.out.println("Remember to bring your umbrella");
        }if(isCold){
            System.out.println("Bring a jacket");
        }else {
            System.out.println("You can go out");
        }

    }
}
