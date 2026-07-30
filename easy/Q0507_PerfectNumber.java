package easy;

public class Q0507_PerfectNumber {
    public static void main(String[] args) {
        System.out.println(findPerfectNumber(7));
        
    }
    public static boolean findPerfectNumber(int num){
        int originalNum = num;
        int sum = 0;
        for(int i = 1 ; i < num ; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(originalNum == sum){
            return true;
        }else{
            return false;
        }
    }
}
