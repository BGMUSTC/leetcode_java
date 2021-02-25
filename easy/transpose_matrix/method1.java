package easy.transpose_matrix;

public class method1 {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
