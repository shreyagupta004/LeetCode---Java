package easy;

public class Q1089_DuplicateZeroes {
    public static void main(String[] args) {
        int arr[] = {1,2,5,0,4,0,3,0};
        duplicateZeroes(arr);
        for(int i = 0 ; i < arr.length ; i++){
             System.out.print(arr[i] + ",");
        }
        
    }
    public static void duplicateZeroes(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length - 1; j > i ; j--){
                    arr[j] = arr[j - 1];
                }
                if(i + 1 < arr.length){
                    arr[i + 1] = 0;
                }
                i++;
            }

        }
    }
}
