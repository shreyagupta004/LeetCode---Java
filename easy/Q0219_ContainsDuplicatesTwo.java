package easy;

import java.util.*;

public class Q0219_ContainsDuplicatesTwo {
    public static void main(String[] args) {
        int nums[] = {1,0,1,1};
        int k = 3;
        Q0219_ContainsDuplicatesTwo obj = new Q0219_ContainsDuplicatesTwo();
        boolean result = obj.containsNearbyDuplicate(nums, k);
        System.out.println(result);

        
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i], i); 
        }
        return false;
    } 
    
}
