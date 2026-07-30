package easy;

public class Q0326_PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        
    }
    public static boolean isPowerOfThree(int num ){
        if(num <= 0){
            return false;
        }
        while(num % 3 == 0){
            num = num / 3;
        }
        return num == 1;

    }
}
