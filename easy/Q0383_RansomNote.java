package easy;

import java.util.HashMap;

public class Q0383_RansomNote {
    public static void main(String[] args) {
        String ranSome = "aa";
        String magazine = "b";
        Q0383_RansomNote obj = new Q0383_RansomNote();
        boolean result = obj.canConstruct(ranSome, magazine);
        System.out.println(result);
        
    }
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(Character ch : ransomNote.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1); 
            
        }
        for(Character ch : magazine.toCharArray()){
             if(map.containsKey(ch) && map.get(ch) > 0){
                 map.put(ch, map.get(ch) - 1);
            }

        }
         for(Integer value : map.values()){
            if(value > 0){
                return false;
            }
        }
           
        return true;
    }
}
