public class secondRowAdd {
    public static int sumOfSecondRow(int nums[][]) {
        int sum = 0;
        int row = 1;
        for(int j=0; j<nums.length; j++) {
            sum += nums[row][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumOfSecondRow(nums));
        
    }
}
