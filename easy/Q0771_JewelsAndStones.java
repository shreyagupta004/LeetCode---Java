package easy;

public class Q0771_JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "abbab";
        String stones = "aaaabbcccbb";
        int result = numJewelsInStones(jewels,stones);
        System.out.println(result);
        
    }
     public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for(int i = 0 ; i < stones.length() ; i++){
            for(int j = 0 ; j < jewels.length() ; j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;

     }   
}
