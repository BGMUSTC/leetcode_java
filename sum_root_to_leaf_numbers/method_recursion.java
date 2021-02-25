package sum_root_to_leaf_numbers;

import tree.TreeNode;

public class method_recursion {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        preOrder(root,0);
        return sum;
    }

    private void preOrder(TreeNode root, int cnt) {
        if (root == null) {
            return ;
        }
        cnt = cnt * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += cnt;
            return ;
        } else {
            preOrder(root.left,cnt);
            preOrder(root.right,cnt);
        }
    }
}
