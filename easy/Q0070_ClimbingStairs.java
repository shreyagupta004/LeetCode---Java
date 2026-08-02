package easy;

public class Q0070_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbingStairs(3));
        
    }
    public static int climbingStairs(int n){
        int a = 1;
        int b = 2;
        int c;
        for(int i = 3 ; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
