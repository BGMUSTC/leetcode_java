package median.binary_tree_right_side_view;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class method_dfs {
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
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
        dfs(root.right, level);
        dfs(root.left, level);
    }
}
