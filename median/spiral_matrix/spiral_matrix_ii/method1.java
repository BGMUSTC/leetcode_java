package median.spiral_matrix.spiral_matrix_ii;

// 59
// https://leetcode-cn.com/problems/spiral-matrix-ii/
public class method1 {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int cnt = 1, left = 0, top = 0, right = n - 1, bottom = n - 1;
        while (left <= right && top <= bottom) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                res[top][i] = cnt++;
            }
            // 从上到下
            for (int i = top + 1; i <= bottom; i++) {
                res[i][right] = cnt++;
            }
            if (top < bottom && left < right) {
                for (int i = right - 1; i >= left; i--) {
                    res[bottom][i] = cnt++;
                }
                for (int i = bottom - 1; i > top; i--) {
                    res[i][left] = cnt++;
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res = generateMatrix(3);
    }
}
