package merge_two_binary_trees;

import tree.TreeNode;

public class method_1 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        if (t1 == null || t2 == null) {
            root = t1 == null ? t2 : t1;
        } else {
            root.val = t1.val + t2.val;
            root.left = mergeTrees(t1.left,t2.left);
            root.right = mergeTrees(t1.right,t2.right);
        }
        return root;
    }
}
