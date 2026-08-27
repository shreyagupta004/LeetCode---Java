package easy;

import java.util.HashMap;

public class Q0409_LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        Q0409_LongestPalindrome obj = new Q0409_LongestPalindrome();
        int result = obj.longestPalindrome(s);
        System.out.println(result);
        
    }
    public static int longestPalindrome(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(Character ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0) + 1);
        }
        int ans = 0;
        boolean odd = false;
        for(int value : map.values()){
            if(value % 2 == 0){
                ans = ans + value;
            }
            else{
                ans = ans + value - 1;
                odd = true;
            }
        }
        if(odd){
            ans++;
        }
        return ans;
    }
}
