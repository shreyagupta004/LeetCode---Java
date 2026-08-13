package easy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Q1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
       
        
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        Iterator<Boolean> IT = result.iterator();
        while(IT.hasNext()){
            System.out.print(IT.next() + ",");
        }
            
        
         
    }
    public static List<Boolean>  kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int j = 0; j < candies.length ; j++){
            if((candies[j] + extraCandies) >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;

    }
}
