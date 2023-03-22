package C13;

public class StringMethodDemo9 {
    public static void main(String[] args) {
        String name="sad today. patrick is happy now";
        char c=name.charAt(28);
         System.out.println(c+" just print c");
// 10 mints break
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)=='.'){
                break;
            }
            System.out.println(name.charAt(i));
        }
    }
}
