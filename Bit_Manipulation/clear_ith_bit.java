package Bit_Manipulation;

public class clear_ith_bit {
    public static int clearIthBit(int n, int i) {
        int bitwise = ~(1<<i);
        return n & bitwise;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(7, 3));
    }
}
