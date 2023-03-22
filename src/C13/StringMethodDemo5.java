package C13;

public class StringMethodDemo5 {
    public static void main(String[] args) {
        String name="Patrick looks sad today";
        boolean isEmpty= name.isEmpty();
        System.out.println(isEmpty);

        String randomName="Kweku moja";
        boolean isNothing=randomName.isEmpty();

        if(isNothing){
            System.out.println("String is accurate");
        }else {
            System.out.println(randomName+ " is not an empty String ");

    }
        String sent="she baaad";
        boolean newSent=sent.isEmpty();

        if(newSent){
            System.out.println(true);
        }else {
            System.out.println(false+" its not empty");
        }
}}
