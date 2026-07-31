package easy;

public class Q2119_ANumberAfterDoubleReversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(3456));
        
    }
    public static boolean isSameAfterReversals(int num) {
        int original = num;
        int rem ;
        int rev = 0;
        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        num = rev;
        rev = 0;
        while(num > 0){
             rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        if(original == rev){
            return true ;
        }else{
            return false;
        }

    }
}
