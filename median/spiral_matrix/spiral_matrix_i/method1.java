package median.spiral_matrix.spiral_matrix_i;

import java.util.ArrayList;
import java.util.List;

// 深圳字节跳动ios实习一面面试题
// 54
// https://leetcode-cn.com/problems/spiral-matrix/
public class method1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            int index = left;
            while (index <= right) {
                res.add(matrix[top][index++]);
            }
            top++;
            if (top > bottom) {
                break;
            }
            index = top;
            while (index <= bottom) {
                res.add(matrix[index++][right]);
            }
            right--;
            if (left > right) {
                break;
            }
            index = right;
            while (index >= left) {
                res.add(matrix[bottom][index--]);
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            index = bottom;
            while (index >= top) {
                res.add(matrix[index--][left]);
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return res;
    }
}
