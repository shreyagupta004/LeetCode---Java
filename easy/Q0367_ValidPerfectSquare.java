package easy;

public class Q0367_ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        
    }
     public static boolean isPerfectSquare(int num) {
        for(int i = 1;i <= num ;i++){

            if((long)i * i == num){
                return true;
            }
            
            if((long)i * i > num){
                return false;
            }
        }
        return false;
            
    }
}

