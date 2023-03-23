package Projects;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 =input.nextInt();
        System.out.println("Please enter the first number");
        int number2 =input.nextInt();
        char operator1='+';
        char operator2='-';
        char operator3='*';
        char operator4='/';
        System.out.println(number1+number2);
        int result=number1+number2;

        int i=0;
        while(i<result){
            if(result>i){
                System.out.println(" say yes");
            }else {
                System.out.println("say No");
            }
            i++;
        }




        }
    }

