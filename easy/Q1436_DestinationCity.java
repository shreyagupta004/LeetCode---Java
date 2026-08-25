package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1436_DestinationCity {
    public static void main(String[] args) {
        
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London","NewYork"));
        paths.add(Arrays.asList("NewYork","Lima"));
        paths.add(Arrays.asList("Lima","San Paulo"));

        Q1436_DestinationCity obj = new Q1436_DestinationCity();

        String result = obj.destCity(paths);
        System.out.println(result);


        
    }
    public static String destCity(List<List<String>> paths){

        for(int i = 0 ; i < paths.size() ; i++){

            String city = paths.get(i).get(1);
            boolean found = false;

            for(int j = 0 ; j < paths.size() ; j++){

                if(paths.get(j).get(0).equals(city)){

                    found = true;
                    break;
                }
            }
            if(found == false){
                return city;

            }
        }
        return " ";
    }
}
