package easy;

public class Q1502_CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        boolean res = canMakeArithmeticProgression(arr);
        System.out.println(res);
        
    }
    public static boolean canMakeArithmeticProgression(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                    
            }
        }
        int diff = arr[1] - arr[0];
        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i] - arr[i - 1] != diff){
                return false;
            }
        }
        return true;
    }
}
