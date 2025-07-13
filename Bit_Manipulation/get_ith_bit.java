package Bit_Manipulation;

public class get_ith_bit {
    public static int ithBit(int n, int i) {
        int bit = (1 << i);
        if((n & bit) == 0)
            return 0;
        else
            return 1;    
    }
    public static void main(String[] args) {
        System.out.println(ithBit(10, 3));
    }
}
