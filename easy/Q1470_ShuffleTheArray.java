package easy;

public class Q1470_ShuffleTheArray {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,1,4};
        Q1470_ShuffleTheArray obj = new Q1470_ShuffleTheArray();
         int result[] = obj.shuffle(arr, 3);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(result[i] + ",");
        }
       
        
        
    }
    public int[] shuffle(int[] nums, int n) {
         int ans[] = new int[2 * n];
         int index = 0;
        for(int i = 0 ; i < n ; i++){
            ans[index] = nums[i];
            index++;

            ans[index] = nums[i + n];
            index++;
           
        }
        return ans;
    }

}
