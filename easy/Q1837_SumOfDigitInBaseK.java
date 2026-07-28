package easy;

public class Q1837_SumOfDigitInBaseK {
    public static void main(String[] args) {
       int result =  baseSum(34 , 6);
       System.out.println(result);
        
    }
    public static int baseSum(int n , int k){
        int rem ;
        int sum = 0;
        while(n != 0){
            rem = n % k;
            sum = sum + rem;
            n = n / k;
        }
        return sum;
    }
}
