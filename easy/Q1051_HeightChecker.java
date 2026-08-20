package easy;

public class Q1051_HeightChecker {
    public static void main(String[] args) {
        int height[] = {5,1,2,3,4};
        int result = heightChecker(height);
        System.out.println(result);
        
    }
    public static int heightChecker(int [] heights){
        int newArray[] = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            newArray[i] = heights[i]; 
        }

        for(int i = 0 ; i < newArray.length ; i++){
            for(int j = 0 ; j < newArray.length - 1 ; j++){
                if(newArray[j] > newArray[j + 1]){
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != newArray[i]){
                count++;
            }
        } 
        return count;
    }
}
