package minimum_path_sum;

// 超时
public class method_dfs {
    int min_sum_dis = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        dfs(grid,0,0,grid.length-1,grid[0].length-1,0);
        return min_sum_dis;
    }

    private void dfs(int[][] grid, int i, int j, int row, int col, int sum) {
        if (i == row && j == col) {
            int tmp = sum + grid[i][j];
            if (tmp < min_sum_dis) {
                min_sum_dis = tmp;
            }
            return;
        }
        int tmp_sum = sum +grid[i][j];
        if (tmp_sum >= min_sum_dis) {
            return;
        }
        if (i < row) {
            dfs(grid,i+1,j,row,col,tmp_sum);
        }
        if (j < col) {
            dfs(grid,i,j+1,row,col,tmp_sum);
        }
    }
}
