package easy;

public class Q1299_ReplaceElementsWithGreatestElementsOnRightSide {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int result[] = replaceElements(arr);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + ",");
        }
        
    }
    public static int[] replaceElements(int[] arr) {

        int max = -1;
        
        for(int i = arr.length - 1; i >= 0 ; i--){

            int current = arr[i];
            arr[i] = max;

            if(current > max){
                max= current;
            }
        }
        return arr;
    }
}
