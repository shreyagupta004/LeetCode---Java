package easy;

public class Q0009_PalindromeNumber {
    public static void main(String[] args) {
        boolean result = palindromeNumber(1821);
        System.out.println(result);
        
    }
    public static boolean palindromeNumber(int n){
        int originalNum = n;
        int rem ;
        int rev= 0;
        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        if(rev == originalNum){
            return true;
        }else{
            return false;
        }
    }
    
}
