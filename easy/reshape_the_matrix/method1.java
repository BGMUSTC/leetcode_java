package easy.reshape_the_matrix;

public class method1 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        if (rows * cols != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int resI = 0;
        int resJ = 0;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                res[resI][resJ++] = nums[i][j];
                if (resJ >= c) {
                    resJ = 0;
                    resI++;
                }
            }
        }
        return res;
    }
}
