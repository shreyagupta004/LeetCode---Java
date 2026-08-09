package easy;

public class Q1678_GoalParserInterpretation {
    public static void main(String args[]){
        String command = "G()(al)";
        String result = interpret(command);  
        System.out.println(result);      
    }
     public static String interpret(String command) {
        String result = "";
        for(int i = 0 ; i < command.length() ; i++){
           char ch = command.charAt(i);
           if(ch == 'G'){
                result = result + ch;
            
           }
           else if(ch == '('){
           
           if(command.charAt(i + 1) == ')'){
             result = result + "o";
           }else{
             result = result + "al";
             i = i + 1;
           }
           }
           
      } 
        return result;
    }
    
    
}
