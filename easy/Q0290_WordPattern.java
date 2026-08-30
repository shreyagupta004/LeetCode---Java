package easy;

import java.util.HashMap;

public class Q0290_WordPattern{
    public static void main(String[] args) {
        
        String pattern  = "abba";
        String s = "dog cat cat dog";
        boolean res = wordPattern(pattern, s);
        System.out.println(res);
        
    }
    public static  boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        
        String[] str = s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }
        
        
        for(int i = 0 ; i < pattern.length() ; i++){

            char ch = pattern.charAt(i);
            String word = str[i];
            
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                map1.put(ch , word);
            }
            if(map2.containsKey(word) ){
                if(map2.get(word) != ch ){
                    return false;
                }
            }
            else{
                map2.put(word ,ch);
            }
        }

        return true;
    }
}