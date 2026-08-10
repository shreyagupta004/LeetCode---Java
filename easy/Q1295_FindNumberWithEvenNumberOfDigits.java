package easy;
public class Q1295_FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
       int num[] = {2,11,4,722,21};
       int result = findNumberWithEvenNumberOfDigits(num);
       System.out.println(result);
        
    }
    public static int findNumberWithEvenNumberOfDigits(int nums[]){
         int ans = 0;
        for(int i = 0;i < nums.length ;i++){
            int num = nums[i];
            int count = 0;
        
        while(num > 0){
            num = num / 10;
            count++;
        }   
        if(count % 2 == 0){
            ans++;
        }
        }
        return ans;
    }
}
