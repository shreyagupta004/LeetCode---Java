package easy;
import java.util.*;
public class Q0217_ContainsDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2} ;
        boolean result = containsDuplicate(nums);
        System.out.println(result);
        
    }
     public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;

        
    }
}
