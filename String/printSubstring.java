package String;

public class printSubstring {
    public static String Substring(String str, int si, int ei) {
        String sub = "";
        for(int i=si; i<ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str = "Rohit Kumar";
        System.out.println((Substring(str, 0, 3)));
    }
}
