package easy;

public class Q0566_ReshapeTheMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1,2} , {3,4}};
        int r = 2;
        int c = 4;
        int result[][] =  matrixReshape(mat, r, c);
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(result[i][j] + " ");
            }
        }
        
    }
        public static  int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[row][col] = mat[i][j];

                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;

    }
}
