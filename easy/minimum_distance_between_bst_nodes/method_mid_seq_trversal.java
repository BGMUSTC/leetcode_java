package easy.minimum_distance_between_bst_nodes;

import tree.TreeNode;

public class method_mid_seq_trversal {
    int pre = -1;
    int minSub = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        traversal(root);
        return minSub;
    }

    private void traversal(TreeNode root) {
        if (null == root) {
            return;
        }
        traversal(root.left);
        if (pre != -1) {
            minSub = Math.min(minSub, root.val - pre);
        }
        pre = root.val;
        traversal(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        method_mid_seq_trversal example = new method_mid_seq_trversal();
        System.out.println(example.minDiffInBST(root));
    }
}
