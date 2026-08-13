package easy;
public class Q1365_HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int nums[] = {8,1,2,7,3};
        int result[] = smallerNumberCount(nums);
        for(int i = 0; i < nums.length ; i++){
            System.out.print(result[i] + ",");
        }
        
    }
    public static int[] smallerNumberCount(int nums[]){
        for(int i = 0 ; i < nums.length ; i++){
            int count  = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            nums[i] = count;
        }
        return nums;
    }
}
