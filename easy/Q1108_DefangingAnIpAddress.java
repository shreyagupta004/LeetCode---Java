package easy;

public class Q1108_DefangingAnIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1";
        String result = defangIPaddr(address);
        System.out.println(result);
        
    }
     public static String defangIPaddr(String address) {
            String result = "" ;
        for(int i = 0 ; i < address.length() ; i++){
              char ch = address.charAt(i);
            if(ch == '.'){
                result = result + "[.]";
            }else{
                result = result + ch;
            }
        } 
        return result;
     }
}
