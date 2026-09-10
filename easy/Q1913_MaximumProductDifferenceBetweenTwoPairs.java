package easy;

import java.util.Arrays;

public class Q1913_MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {

        int nums[] ={1,4,7,9,2};
        int res = maxProductDifference(nums);
        System.out.println(res);
        
    }
    public static  int maxProductDifference(int[] nums) {

            Arrays.sort(nums);

            int a = nums[0] , b = nums[1]   ;
            int c = nums[nums.length - 1], d = nums[nums.length - 2];
        
        return (c * d) - (a * b); 
    }
}
