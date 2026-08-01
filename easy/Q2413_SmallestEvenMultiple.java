package easy;

public class Q2413_SmallestEvenMultiple {
    public static void main(String[] args) {
      int result = smallestEvenMultiple(15);
      System.out.println(result);
        
    }
    public static int smallestEvenMultiple(int num){
        if(num % 2 == 0){
            return num;
        }
        else{
            num = num * 2;
            return num;
        }
    }
}
