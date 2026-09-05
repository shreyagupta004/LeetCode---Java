package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q2032_TwoOutOfThree {
    public static void main(String[] args) {
        
        int nums1[] = {1,1,3,2};
        int nums2[]= {2,3};
        int nums3[] = {3};

        Q2032_TwoOutOfThree obj = new Q2032_TwoOutOfThree();

        List<Integer> result = obj.twoOutOfThree(nums1, nums2, nums3);

            System.out.println(result);
        
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : nums3){
            set3.add(num);
        }

        HashSet<Integer> all = new HashSet<>();
        all.addAll(set1);
        all.addAll(set2);
        all.addAll(set3);

        List<Integer> result = new ArrayList<>();

        for(int num : all){

            int count = 0;

            if(set1.contains(num)){
                count++;
            }
            if(set2.contains(num)){
                count++;
            }
            if(set3.contains(num)){
                count++;
            }

            if(count >= 2){
                result.add(num);
            }

        }
        return result;


    }
}
