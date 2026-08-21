package easy;

public class Q1925_CountSquareSumTriplets {
    public static void main(String[] args) {
        int results = squareSumTriplets(5);
        System.out.println(results);
        
    }
    public static int squareSumTriplets(int n){
        int count = 0;
        for(int a = 1 ; a <= n ; a++){
            for(int b = 1 ; b <= n ; b++){
                for(int c = 1 ; c <= n ; c++){
                    if(a*a + b*b == c*c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
