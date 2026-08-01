package easy;

public class Q1952_ThreeDivisors {
    public static void main(String[] args) {
        System.out.println(threeDivisors(4));
        
    }
    public static boolean threeDivisors(int num){
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
           if(num % i == 0 ){
            count++;
           }
        }
        if(count == 3){
             return true;
         }else{
            return false;
           } 
    }
}
