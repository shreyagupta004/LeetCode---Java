package easy;

public class Q2520_CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        int result = CountTheDigitsThatDivideANumber(121);
        System.out.println(result);
        
    }
    public static int CountTheDigitsThatDivideANumber(int n){
        int originalNum = n;
        int rem ;
        int digit;
        int count = 0;
        while(n != 0){
            rem = n % 10;
            digit = rem;
            n = n / 10;
            if(digit != 0 && originalNum % digit == 0){
                count++;
            }
        }
        return count;
    }
}
