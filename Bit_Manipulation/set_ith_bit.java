package Bit_Manipulation;

public class set_ith_bit {
    public static int setIthBit(int n, int i) {
        int bit = 1 << i;
        return n | bit;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(3, 2));
    }
}
