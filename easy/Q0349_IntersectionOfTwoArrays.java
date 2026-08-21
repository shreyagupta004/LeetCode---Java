package easy;

public class Q0349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {1,4,5,7,2,2};
        int nums2[] = {4,2,5};
        int arr[] = intersection(nums1, nums2);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ",");
        }
        
    }
     public static  int[] intersection(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        int k = 0;
        for(int i = 0 ; i< nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){

                if(nums1[i] == nums2[j]){
                   boolean duplicate = false;
                    for(int x = 0; x < k; x++) {

                        if(arr[x] == nums1[i]) {
                           duplicate = true;
                             break;
                        }
                    }
                    if(!duplicate) {
                        arr[k] = nums1[i];
                        k++;
                    }
                    break;
                }

            } 
        } 
         int result[] = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
