package easy;

public class Q0069_Sqrt{
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        
    }
     public static int mySqrt(int x) {
        
            for (int i =0; i<=x; i++){
               if((long)i * i > x){
                return i - 1;
               }
            }
            return x;    
        
    }

}
