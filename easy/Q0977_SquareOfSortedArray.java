package easy;

public class Q0977_SquareOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-7,2,5,8,10};
         int result[] = sortedSquares(nums);
       for(int i = 0 ; i < nums.length ; i++){
          
            System.out.print(result[i] + " ");
       }

        
    }
    public static int[] sortedSquares(int[] nums) {
          int left = 0;
          int right = nums.length - 1;
          int[] ans = new int[nums.length];
          int k = nums.length - 1;
         
             while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right]) ){
                ans[k] = nums[right] * nums[right];
                right--;
            }else{
              ans[k] = nums[left] * nums[left];
              left++;

            }
            k--;
        }
        return ans;
    
    }
}
