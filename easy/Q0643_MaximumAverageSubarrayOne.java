package easy;
public class Q0643_MaximumAverageSubarrayOne{
    public static void main(String[] args) {

        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        double result = maximumAverage(nums, k);
        System.out.println(result);
        
    }
    public static double maximumAverage(int nums[] , int k){

        int sum = 0;

        for(int i = 0 ; i < k ; i++){

            sum  = sum + nums[i];
        }
        
        int maxSum  = sum;

        for(int i = k ; i < nums.length ; i++){

            sum = sum - nums[i - k] + nums[i];

            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }
}