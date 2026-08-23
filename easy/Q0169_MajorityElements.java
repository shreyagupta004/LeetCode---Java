package easy;

public class Q0169_MajorityElements {
    public static void main(String[] args) {
        int nums[] = {1,2,4,6,6,6,6};
        int res  = majorityElement(nums);
        System.out.println(res);
        
    }
     public static int majorityElement(int[] nums) {
       
        for(int i = 0 ; i < nums.length ; i++){

             int count = 0;

            for(int j = 0 ; j < nums.length ; j++){

                if(nums[i] == nums[j]){

                    count++;
                }
            }
            if(count > nums.length/2){
                
                return nums[i];
            }
          
        }
         return -1;
    }
}
