package easy;
public class Q0344_ReverseString {
   public static void main(String[] args) {
    char s [] = {'H','E','L','L','O'};
    Q0344_ReverseString a = new Q0344_ReverseString();
     a.reverseString(s);
    for(int i = 0 ; i < s.length ; i++){
        System.out.print(s[i] + " ");
    }

   } 
    public static void reverseString(char[] s){
        char temp = 0;
        int left = 0;
        int right = s.length -1;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
