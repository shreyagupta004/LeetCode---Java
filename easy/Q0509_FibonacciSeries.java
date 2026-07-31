package easy;

public class Q0509_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fib(7));
        
    }
    public static int fib(int n) {

        int a = 0;
        int b = 1;
        int c;

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        for(int i = 2; i<=n ; i++){
            c = a + b;
            a = b ;
            b = c;
        }

        return b;    
    }
}
