package easy;

import java.util.*;

public class Q1773_CountItemsMatchingARule {
    public static void main(String[] args) {
       List<List<String>> items = new ArrayList<>();
       items.add(Arrays.asList("phone", "blue", "pixel"));
       items.add(Arrays.asList("computer", "silver", "lenovo"));
       items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";

        Q1773_CountItemsMatchingARule obj = new Q1773_CountItemsMatchingARule();

        int ans = obj.countMatches(items , ruleKey , ruleValue);
        System.out.println(ans);
        
       
        
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){

        int count = 0;

        int index;

        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals(("color"))){
            index = 1;
        }
        else{
            index = 2;
        }

        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
    
}
