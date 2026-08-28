package easy;

import java.util.HashSet;

public class Q0202_HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean res = isHappy(n);
        System.out.println(res);
        
    }
        public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            int rem;

            while(n > 0){
            rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
            n = sum;
        }
       
        return n == 1;
    }

}
