package easy;
public class Q0709_ToLowerCase{
    public static void main(String args[]){
        String s = "LOVELY";
        String res = lowerCase(s);
        System.out.println(res);
    }
    public static String lowerCase(String s){
        String str = "";
        for(int i = 0 ; i < s.length() ; i++){
            str = str + Character.toLowerCase(s.charAt(i));
        }
        return str;
    }
}