package C6LogicalOperators;
/*
 Write a program for a weather app that recommends whether to wear a coat or not based on
    the temperature and whether it is raining or not. If the temperature is less than or equal to 50 degrees
    Fahrenheit or it is raining, then the app should recommend wearing a coat.
 */
public class Task7 {
    public static void main(String[] args) {
        int temperature=20;
        boolean isRaining=true;

        if(temperature<=50 && isRaining){
            System.out.println("Wear a coat");
        }else {
            System.out.println("enjoy");
        }
    }
}
