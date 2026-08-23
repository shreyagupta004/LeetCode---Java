package easy;

public class Q0724_FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int result = pivotIndex(nums);
        System.out.println(result);
        
    }
    public static  int pivotIndex(int[] nums) {
       int totalSum = 0;
       int leftSum = 0;

       for(int i = 0 ; i < nums.length ; i++){

        totalSum = totalSum + nums[i];

       }
       for(int i = 0 ; i < nums.length ; i++){

        int rightSum  = totalSum - leftSum - nums[i];

        if(leftSum == rightSum){

            return i;
        }
        
        leftSum = leftSum + nums[i];

       }

       return -1;
    }
}
