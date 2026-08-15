package easy;

public class Q0867_TransposeAMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        int result[][] = transposeAMatrix(matrix);
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static int[][] transposeAMatrix(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans[][] = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;

    }

}
