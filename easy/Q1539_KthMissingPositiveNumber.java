package easy;

public class Q1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 2;
        int result = findKthPositive(arr, k);
        System.out.println(result);
        
    }
    public static int findKthPositive(int[] arr, int k) {

         int num = 1 ;
        while(k > 0){
            boolean found = false;
            for(int i = 0 ; i < arr.length ; i++){
                
                if(arr[i] == num){ 
                    found = true;
                    break;
                }
            }
                if(found == false){
                    k--;
                }
                if(k == 0){
                    return num;
                }
                 num++;

            }
    
        return -1;
    }
}
