package easy;
public class  Q0557_ReverseWordsInAStringThree{
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
        
    }
    public static String reverseWords(String s ){

         String[] words = s.split(" ");
      String ans = "";

      for(int i = 0 ; i < words.length ; i++){

        String word = words[i];

        for(int j = word.length() - 1 ; j >= 0 ; j--){
            ans = ans + word.charAt(j);

        }
        if(i != words.length - 1){
           ans = ans + " ";
        }
      }
      return ans;
    }
}