package easy;

public class Q1523_CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int result = countOdds(3, 7);
        System.out.println(result);
        
    }
    public static int countOdds(int low,int high){
         int count = 0;
        for ( int i = low; i <= high ; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        return count;
        
    }
}
