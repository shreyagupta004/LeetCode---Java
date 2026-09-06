package easy;

import java.util.HashSet;

public class Q0804_UniqueMorseCodeWords {
    public static void main(String[] args) {
        
        String words[] = {"gin","zen","gig","msg"};
        int res = uniqueMorseRepresentations(words);
        System.out.println(res);
        
    }
    public static int uniqueMorseRepresentations(String[] words) {

        String morse[] = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
        "-.--","--.."};
        
        HashSet<String> set = new HashSet<>();

        for(String word : words){

            String code = "";

        
        for (char ch : word.toCharArray()) {

                code += morse[ch - 'a'];
            }

            set.add(code);
        }
        return set.size();
    }
}
