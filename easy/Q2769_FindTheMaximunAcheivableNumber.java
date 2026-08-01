package easy;

public class Q2769_FindTheMaximunAcheivableNumber {
    public static void main(String[] args) {
        int result = findTheMaximunAcheivableNumber(4, 2);
        System.out.println(result);
        
    }
    public static int findTheMaximunAcheivableNumber(int num, int k){
        int num1 = num + k;
        num1 = num1 + k;
        return num1;
    } 
}
