package Bit_Manipulation;

public class oddEven {
    public static void odd_Even(int n){
        int bit = 1;
        if((n & bit) == 0) {
            //even
            System.out.println("Even Number");
        }else{
            //odd
            System.out.println("Odd number");
        }
    } 
    public static void main(String[] args) {
        odd_Even(9);
        odd_Even(10);
    }
}
