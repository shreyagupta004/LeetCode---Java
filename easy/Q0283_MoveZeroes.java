package easy;

public class Q0283_MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        
    }
    public static void moveZeroes(int nums[]){

        int pos = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
    }
}
