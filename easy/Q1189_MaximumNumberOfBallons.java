package easy;

import java.util.HashMap;

public class Q1189_MaximumNumberOfBallons{
    public static void main(String[] args) {
        String text = " berathlfolson";
        int res = maxNumberOfBalloons(text);
        System.out.println(res);
        
    }
    public static  int maxNumberOfBalloons(String text){

        HashMap<Character , Integer> map = new HashMap<>();

        for(Character ch : text.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0) + 1);
        }
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        int ans = b ;

        ans = Math.min(ans , a);
        ans = Math.min(ans , l);
        ans = Math.min(ans , o);
        ans = Math.min(ans , n);

        return ans;


    }
}