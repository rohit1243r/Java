package String;

public class largestString {
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};
        String larget = str[0];
        for(int i=0; i<str.length; i++) { //Lexicographic 
            // if == return : 0
            // if < 0 return : -ve
            // if > 0 return : +ve
            if (larget.compareTo(str[i]) < 0) {
                larget = str[i];
            }
        }
        System.out.println(larget);
    }
}
