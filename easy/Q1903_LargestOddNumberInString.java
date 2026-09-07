package easy;
public class Q1903_LargestOddNumberInString{
    public static void main(String args[]){
        String num = "5467";
        String res = largestOddNUmber(num);
        System.out.println(res);

    }
    public static String largestOddNUmber(String num){

        for(int i = num.length() - 1 ; i >= 0 ; i-- ){

            int digit = num.charAt(i) - '0';

            if(digit % 2 != 0){
                return num.substring(0 , i + 1);
            }
        }
        return "";
    }

}