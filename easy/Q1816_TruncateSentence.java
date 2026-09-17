package easy;
public class Q1816_TruncateSentence{
    public static void main(String args[]){

        String s = "chopper is not a tanuki";
        int k = 4;
        String res = trucateSentence(s, k);
        System.out.println(res);
    }
    public static String trucateSentence(String s , int k){

        String words[] = s.split(" ");
        String ans = "";

        for(int i = 0 ; i < k ; i++){
            ans = ans + words[i];

            if(i < k - 1){
                ans = ans + " ";
            }
        }
        return ans;
    }
}