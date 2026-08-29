package easy;

import java.util.HashMap;

public class Q0389_FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcdef";
        char res = findDifference(s, t);
        System.out.println(res);
        
    }
    public static char findDifference(String s , String t){

        HashMap<Character , Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0 ) + 1);
        }

        for(Character ch : t.toCharArray()){
            int count = map.getOrDefault(ch, 0);
            if(count == 0){
                return ch;
            }
            map.put(ch , count - 1);
        }
        return ' ';
    }
}
