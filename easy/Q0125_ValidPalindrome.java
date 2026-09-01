package easy;

public class Q0125_ValidPalindrome{
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        boolean res = validPalindrome(s);
        System.out.println(res);


    }
    public static boolean validPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            char leftChar = s.charAt(left);
            char rightChar  = s.charAt(right);

            while(left < right && !Character.isLetterOrDigit(leftChar)){
                left++;
                leftChar = s.charAt(left);
            }
            while(left < right && !Character.isLetterOrDigit(rightChar)){
                right--;
                rightChar = s.charAt(right);
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}