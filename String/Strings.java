package String;
import java.util.*;
public class Strings {
    public static void printLetter(String str) {
        for(int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = {'A','B','C'};
        System.out.println(ch.length);

        String str = "Rohit";
        System.out.println(str.length());

        String firstName = "Rohit";
        String lastName = "Kumar";
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));

        // String str1 = sc.nextLine();
        // System.out.println(str1);

        printLetter(str);
        sc.close();
    }
}
