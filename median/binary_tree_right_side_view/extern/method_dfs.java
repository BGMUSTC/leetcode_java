package median.binary_tree_right_side_view.extern;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 拓展
// 二叉树的左视图
public class method_dfs {
    List<Integer> res = new ArrayList<>();

    public List<Integer> leftSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        level++;
        if (level > res.size()) {
            res.add(root.val);
        }
        dfs(root.left, level);
        dfs(root.right, level);
    }
}
