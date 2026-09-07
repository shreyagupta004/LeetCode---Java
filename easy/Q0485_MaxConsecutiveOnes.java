package easy;
public class Q0485_MaxConsecutiveOnes{
    public static void main(String[] args) {

        int num[] = {1,0,1,1,0,1};
        int res = maxConsecutiveOnes(num);
        System.out.println(res);
        
    }
    public static int maxConsecutiveOnes(int num[]){

        int count = 0;
        int max = 0;

        for(int i = 0 ; i < num.length ; i++){

            if(num[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }

            }
            else{
                count = 0;
            }
                
        }
        return max;
        
    }
}