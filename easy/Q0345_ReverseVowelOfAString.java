package easy ;
public class Q0345_ReverseVowelOfAString{
    public static void main(String[] args) {
        String s = "leetcode";
        String result =  reverseVowels( s);

        System.out.println(result);
        
    }
    public static String reverseVowels(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while(left < right){

            char leftChar = arr[left];
            char rightChar = arr[right];

            if("aeiouAEIOU".indexOf(leftChar) == -1){
               left++;
            }
            else if("aeiouAEIOU".indexOf(rightChar) == -1){
                right--;
            }

            else{
               char temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                
                left++;
                right--;
      
               }            
            
                         
        }
        return new String(arr);
    }
}

