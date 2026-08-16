package easy;

public class Q0832_FlippingAnImage {
    public static void main(String[] args) {
        int image[][] = {{1,0,1} , {1,1,0} , {0,0,0}};
        int result[][] = flipAndInvertImage(image);
        for(int i = 0 ; i < image.length ; i++){
            for(int j = 0 ; j < image[0].length ; j++){
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
        
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int temp;
       
        for(int i = 0 ; i < row ; i++){
             int left = 0;
             int right = col - 1;
            while(left <= right){
                    
                    temp = image[i][left];
                    image[i][left] = image[i][right];
                    image[i][right] = temp;

                    if(left == right){
                        image[i][left] = 1 - image[i][left];
                    }
                    else{
                         image[i][left] = 1 - image[i][left];
                         image[i][right] = 1 - image[i][right];
                    }

                    left++;
                    right--;
                
            }
        }        
        return image;
    }
    
}
