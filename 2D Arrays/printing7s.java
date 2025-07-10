public class printing7s {
    public static int print7sNum(int nums[][], int n){
        int count = 0;

        //Note: Bruteforce Method (O(n^2))
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++) {
                if(nums[i][j] == n) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int nums[][] = {{4,7,8},{8,8,7}};
        System.out.println(print7sNum(nums, 7));
    }
}
