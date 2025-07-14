package Bit_Manipulation;

public class clear_range_bits {
    public static int clearIthBit(int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitmaks = a | b;
        return n & bitmaks;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 2, 4));
    }
}
