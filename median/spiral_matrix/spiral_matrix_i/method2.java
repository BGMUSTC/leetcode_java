package median.spiral_matrix.spiral_matrix_i;

import java.util.ArrayList;
import java.util.List;

public class method2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // 从上到下
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            // 注意判定是否能进行下两步
            if (left < right && top < bottom) {
                // 从右到左
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                // 从下到上
                for (int i = bottom - 1; i > top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            top++;
            left++;
            bottom--;
            right--;
        }
        return res;
    }
}
