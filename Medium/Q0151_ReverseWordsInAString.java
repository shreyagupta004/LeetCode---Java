package Medium;
public class Q0151_ReverseWordsInAString{
    public static void main(String[] args) {
        String s = "let,s code";
        String res = reverseWords(s);
        System.out.println(res);
        
    }
     public static  String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");

       int left = 0; 
       int right = arr.length - 1;
       
       while(left < right){

        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
       }
       
       return String.join(" ", arr);
    }
}