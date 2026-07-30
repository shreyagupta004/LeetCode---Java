package easy;
public class Q0268_MissingNumbers{
    public static void main(String args[]){
        int nums[] = {0,2,3};
       System.out.println(missingNumber(nums));

    }
    public static  int missingNumber(int nums[]){
        int n = nums.length;
        int actualSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            actualSum = actualSum + nums[i];
        }

        int expectedSum = (n * (n + 1)) / 2;
        return expectedSum - actualSum;
    }
}