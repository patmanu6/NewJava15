package C13;

public class StringMethodDemo11 {
    public static void main(String[] args) {
        String name="sad today. patrick is happy now";
        // replaces the letters or words
        System.out.println(name.replace("patrick","Batyr"));


        String save="She is not happy";
        String newSave=save.replace("happy", "sad");
        System.out.println(newSave);

        String namePlace="Ghana";
        String newPlace=namePlace.replace("Ghana","Nigeria");
        System.out.println(newPlace);
        String lastName="Manu";
        String NewName=lastName.replace("Manu","Delossantos");
        System.out.println(NewName);

    }
}
