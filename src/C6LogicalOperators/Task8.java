package C6LogicalOperators;
/*
 Write a program for a sports team that determines whether a player is eligible to play
    in a game based on their age and whether they have completed a required training session.
    If the player is at least 18 years old and has completed the training session, then they are
    eligible to play

 */
public class Task8 {
    public static void main(String[] args) {
        int age=17;
        boolean isTraining=true;

        if(age>=18)if(isTraining){
            System.out.println("Eligible to play");
        }else {
            System.out.println("You have to meet the requirement");
        }

    }
}
