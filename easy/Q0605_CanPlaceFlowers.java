package easy;
public class Q0605_CanPlaceFlowers{
    public static void main(String args[]){
        int flowerbed[] = {1,0,0,0,1};
        int n  = 1;
        boolean res = canPlaceFlowers(flowerbed, n);
         System.out.println(res);


    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int left = 0;
        int right = 0;
        int current = 0;

       for(int i = 0 ; i < flowerbed.length ; i++){
            if(flowerbed[i] == 1){
                continue;
            } 
            else{
                if(i == 0){
                    left = 0;
                }
                else{
                    left = flowerbed[i - 1];
                 }

                if(i == flowerbed.length - 1 ) {
                    right = 0;
                }else{
                    right = flowerbed[i + 1];
                }
            }

            if(left == 0 && right == 0){
                current = 1;
                flowerbed[i] = 1;
                n--;
            }
        } 
        return n <= 0;
    }
 }