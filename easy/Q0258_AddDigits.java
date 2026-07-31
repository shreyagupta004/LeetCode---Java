package easy;

public class Q0258_AddDigits {
    public static void main(String[] args) {
        int result = addDigits(57);
        System.out.println(result);
        
    }
    public static int addDigits(int num){
         while(num >= 10){
            int sum = 0;
            while(num > 0){
              int  rem = num % 10;
                sum = sum + rem;
                num = num / 10;
               
            }
             num = sum;
        }
        return num;
        
    }
}
