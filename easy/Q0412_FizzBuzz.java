package easy;

import java.util.ArrayList;
import java.util.List;

public class Q0412_FizzBuzz {
    public static void main(String[] args) {
        Q0412_FizzBuzz obj = new Q0412_FizzBuzz();
        int n = 5;

        List<String> result = obj.fizzBuzz(n);

        System.out.println(result);

        
    }
     public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }   
        }  
        return list;
    }
}
