package easy;

import java.util.*;

public class Q1380_LuckyNumberInMatrix {
    public static void main(String[] args) {
         int[][] matrix = {
        {3, 7, 8},
        {9, 11, 13},
        {15, 16, 17}
    };

    System.out.println(luckyNumber(matrix));

        
    }
    public static List<Integer> luckyNumber(int [][] matrix){
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0 ; i < row ; i++){
            int smallest = matrix[i][0];
            int colIdx = 0;
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                    colIdx = j;
                }
            }
            int largest = matrix[0][colIdx];
            for(int k = 0 ; k < row ; k++){
                if(matrix[k][colIdx] > largest){
                    largest = matrix[k][colIdx];
                }
            }
            if(smallest == largest){
                ans.add(smallest);
            }
        }
        return ans;
        
    }
}
