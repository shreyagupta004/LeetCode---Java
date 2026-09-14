package easy;
public class Q0704_BinarySearch{
    public static void main(String args[]){
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int res = binarySearch(arr, target);
        System.out.println(res);
        
    }
    public static int binarySearch(int nums[] , int target){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(target ==nums[mid]){
                return mid + 1;
            }
            if(target > nums[mid]){
                start = mid + 1;
            }
            if(target < nums[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}