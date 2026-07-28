package easy;

public class Q0007_ReverseInteger {
 public static void main(String[] args) {
    int result = reverseIneger(679);
    System.out.println(result);
    
 }   
 public static int reverseIneger(int num){
    int rem ;
    int rev= 0;
    while(num !=0){
        rem = num % 10;
        if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 &&  rev > 7)){
            return 0;
        }
        if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rev < -8)){
            return 0;
        }
        rev = rev * 10 + rem;
        num = num / 10;
    }
    return rev;
 }
}
