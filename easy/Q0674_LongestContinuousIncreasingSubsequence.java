package easy;
public class Q0674_LongestContinuousIncreasingSubsequence{
    public static void main(String[] args) {

        int nums[] = {1,3,5,4,7};
        int res = findLengthOfLCIS(nums);
        System.out.println(res);
        
    }
    public static int findLengthOfLCIS(int[] nums){

        int count = 1;
        int max  = 1;

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] > nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
