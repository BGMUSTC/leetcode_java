package median.binary_tree_level_order_search;

import TreeNode.TreeNode;

import java.util.*;

// 102
// https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
public class method1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> resTmp = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode tmp = queue.poll();
                resTmp.add(tmp.val);
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
            res.add(resTmp);
        }
        return res;
    }
}
