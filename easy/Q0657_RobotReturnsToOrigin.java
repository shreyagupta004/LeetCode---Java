package easy;

public class Q0657_RobotReturnsToOrigin {
    public static void main(String[] args) {

        String s = "UDLDRLR";
        boolean res = judgeCircle(s);
        System.out.println(res);
        
    }
    public static boolean judgeCircle(String s){
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == 'U'){
                y++;
            }
            else if(s.charAt(i) == 'D'){
                y--;
            }
            else if(s.charAt(i) == 'L'){
                x--;
            }
            else if(s.charAt(i) == 'R'){
                x++;
            }
            
        }
        return x == 0 && y == 0;
    }
}
