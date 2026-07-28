package easy;
public class Q1281_SubtractProductAndSum {
    public static void main(String[] args) {
       System.out.println(subtractProductAndSum(8765));
        
    }
    public static int subtractProductAndSum(int n){
        int rem ;
        int product = 1;
        int sum = 0;
        while(n != 0){
            rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        return product - sum;
    }
}
