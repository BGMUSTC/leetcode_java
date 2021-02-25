package minimum_path_sum;

public class method_dp {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        // 初始化
        dp[0][0] = grid[0][0];
        for (int i=1;i<grid.length;i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j=1;j<grid[0].length;j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        // 初始化完毕
        for (int i=1;i<grid.length;i++) {
            for (int j=1;j<grid[0].length;j++) {
                dp[i][j] = Math.min(dp[i-1][j] + grid[i][j], dp[i][j-1] + grid[i][j]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
