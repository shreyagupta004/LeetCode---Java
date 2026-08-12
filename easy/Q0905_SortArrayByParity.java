 package easy;
 public class Q0905_SortArrayByParity{
    public static void main(String[] args) {
        int nums[] = {9,1,2,7,8,10};
        Q0905_SortArrayByParity obj  = new Q0905_SortArrayByParity();
        int result[] = sortArrayByParity(nums);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + ",");
        }
        
    }
    public static int[] sortArrayByParity(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] % 2 == 0){
                left++;
            }
            else if(nums[right] % 2 != 0){
                right--;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
 }