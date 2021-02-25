package search_a_2d_matrix;

public class method_mock {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rowNum = matrix.length - 1;
        int colNum = matrix[0].length - 1;
        if (target < matrix[0][0]) {
            return false;
        }
        if (target > matrix[rowNum][colNum]) {
            return false;
        }

        int index = 0;
        for (;index < rowNum;index++) {
            if (target >= matrix[index][0] && target <= matrix[index][colNum]) {
                break;
            }
        }
        for (int i=0;i<=colNum;i++) {
            if (matrix[index][i] > target) {
                return false;
            }
            if (matrix[index][i] == target) {
                return true;
            }
        }
        return false;
    }
}
