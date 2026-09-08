package easy;

public class Q0896_MonotonicArray {
    public static void main(String[] args) {

        int nums[] = {1,2,2,3};
        System.out.println(monotonicAraay(nums));
        
    }
    public static boolean monotonicAraay(int nums[]){

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] < nums[i - 1]){
                increasing = false;
            }
            if(nums[i] > nums[i - 1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
