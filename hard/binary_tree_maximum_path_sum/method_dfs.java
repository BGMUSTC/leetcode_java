package hard.binary_tree_maximum_path_sum;

import TreeNode.TreeNode;

// 124
// https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
public class method_dfs {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if (root == null ){
            return 0;
        }
        int left = Math.max(maxGain(root.left), 0);
        int right = Math.max(maxGain(root.right), 0);
        maxSum = Math.max(root.val + left + right, maxSum);
        int ret = root.val + Math.max(left, right);
        return ret;
    }
}
