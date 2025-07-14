package Bit_Manipulation;

public class clear_last_ith_bit {
    public static int clearLastIthBit(int n, int i) {
        int bitmask = ((~0) << i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(5, 3));
    }
}
