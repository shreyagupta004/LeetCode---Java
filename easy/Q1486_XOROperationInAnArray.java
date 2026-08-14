package easy;

public class Q1486_XOROperationInAnArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int result = xorOperation(n, start);
        System.out.println(result);
        
    }
    public static int xorOperation(int n , int start){
        int result = 0;
        for(int i = 0; i < n ; i++){
            int num = start + (2 * i);
            result = result ^ num;
        }
        return result;
    }

}
