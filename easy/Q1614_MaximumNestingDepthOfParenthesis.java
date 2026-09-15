package easy;
public class Q1614_MaximumNestingDepthOfParenthesis{
    public static void main(String args[]){
        String s = "(1+(2*3)+((8)/4))+1";
        int res = maxDepth(s);
        System.out.println(res);
    }
    public static int maxDepth(String s){
        int count = 0 ;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '('){
                count++;
                max = Math.max(count , max);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return max;
    }
}