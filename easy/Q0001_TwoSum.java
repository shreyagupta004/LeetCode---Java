package easy;

import java.util.Arrays;
import java.util.HashMap;

public class Q0001_TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

        
        int[] result = twoSum(nums, target);

         for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
    public static int[] twoSum(int nums[] , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        int i = 0;
        for(int n : nums){
            int num = target - n;
            if(map.containsKey(num)){
                return new int[]{map.get(num) , i};
            }
            map.put(n,i);
            i++;
        }
        return new int[]{};
    }
}
