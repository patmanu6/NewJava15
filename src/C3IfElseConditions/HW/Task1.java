package C3IfElseConditions.HW;
/*1) Create a variable height that stores a person's height in centimeters then write an if else condition that prints whether
the person is tall (height greater than or equal to 180 cm it should print tall otherwise print not tall) or not

 */
public class Task1 {
    public static void main(String[] args) {

        int height=180;
        if(height>=180){
            System.out.println("Taller");
        }else{
            System.out.println("Not tall");
        }
    }

}
