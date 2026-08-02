package easy;

public class Q0058_LengthOfLastWord {
    public static void main(String[] args) {
        String s = "my name is shreya";
       int result = lengthOfLastWord(s);
        System.out.println(result);
        
    }
    public static int lengthOfLastWord(String s){
        int count = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) == ' ' && count == 0){
                continue;
            }
            if(s.charAt(i) == ' ' && count > 0){
                return count ;
            }
            count++;
        }
        return count;
    }
}
