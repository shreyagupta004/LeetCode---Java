package easy;
public class Q0014_LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower" , "flow" , "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
        
    }
     public static String longestCommonPrefix(String[] strs) {
       
        for(int i = 0 ; i < strs[0].length() ; i++){
            for(int j = 1 ; j < strs.length ; j++){
                if(strs[0].charAt(0) == strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            
        }
        return "";
        
    }
}
