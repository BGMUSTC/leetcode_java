package binary_tree_preorder_traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class method_recursion {
    List<Integer> res = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return res;
    }
}
