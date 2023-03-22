package C13;
/*
create a variable call it userName and store some String in it
    check userName variable with if else conditions for below
    if username is less than 8 characters print "UserName must be 8 characters"
    if username is more than 16 print "Username can't be more than 16 chars"
    if username contains the word "password " in it print "username can't contain password"
    else print "userName created successfully "
     */

public class Stringmethods {
    public static void main(String[] args) {
        String userName = "Pizzaro";
        int number=8;

        if (userName.length() < 8) {
            System.out.println("Username must be 8");
        }

        else if (userName.length()>16) {
            System.out.println("Username should not be more than 16");

        } else if(userName.contains("password")){
            System.out.println("userName cannot contain password");
        }else{
            System.out.println("Password created succesfullly");
        }
String user="Sahikddidndhdnddjdndnd";
        int newUser=user.length();
        int numb=8;
        System.out.println(newUser);

        if(newUser<=numb && newUser>=numb){
            System.out.println("User pwd is correct");
        }else {
            System.out.println("user pwd is incorrect");
        }

    }
}
