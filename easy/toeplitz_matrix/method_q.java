package easy.toeplitz_matrix;

public class method_q {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length,cols = matrix[0].length;
        for (int i = 0; i < cols; i++) {
            int m = i, n = 0;
            while(m < cols && n < rows) {
                if (matrix[0][i] != matrix[n++][m++]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            int m = i, n = 0;
            while (m<rows && n < cols) {
                if (matrix[i][0] != matrix[m++][n++]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] data = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(data));
    }
}
