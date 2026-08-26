package easy;
import java.util.*;
public class Q242_ValidAnagram{
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        Q242_ValidAnagram obj =  new Q242_ValidAnagram();
         boolean result = gram(s, t);

        System.out.println(result);
    }

     public static boolean gram(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
         if (s.length() != t.length()) {
            return false;
        }

        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            
        }
        for(Character ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
             map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
            
        }
        return map.isEmpty();
       
    }
   
    
}