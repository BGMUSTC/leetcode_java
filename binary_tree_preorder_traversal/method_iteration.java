package binary_tree_preorder_traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class method_iteration {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                if (root.right != null) {
                    stack.addLast(root.right);
                }
                root = root.left;
            }
            root = stack.pollLast();
        }

        return res;
    }
}
