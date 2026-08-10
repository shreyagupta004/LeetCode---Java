package easy;
public class Q1221_SplitAStringInABalancedString {
    public static void main(String[] args) {
        String s = "RRLLRLRLLRLLRR";
        int result = balancedStringSplit(s);
        System.out.println(result);
        
    }
    public static int balancedStringSplit(String s){
        int balance = 0;
        int count = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == 'R'){
                balance = balance + 1;
            }else{
                balance = balance - 1;
            }
            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}
