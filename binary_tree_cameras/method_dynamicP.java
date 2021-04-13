package binary_tree_cameras;

public class method_dynamicP {
    public int minCameraCover(TreeNode root) {
        stats res = minCam(root);
        return Math.min(res.withCam,res.noCamWatchBySon);
    }

    private stats minCam(TreeNode root) {
        if (root == null) {
            return new stats(Integer.MAX_VALUE / 2, 0,0);
        }
        stats left = minCam(root.left);
        stats right = minCam(root.right);
        int withCam = 1 + Math.min(left.noCamWatchByDad + right.noCamWatchByDad,Math.min(left.withCam + right.noCamWatchByDad,left.noCamWatchByDad + right.withCam));
        int noCamWatchByDad = Math.min(Math.min(left.withCam + right.withCam, left.withCam+ right.noCamWatchBySon) ,Math.min(left.noCamWatchBySon + right.withCam, left.noCamWatchBySon + right.noCamWatchBySon));
        int noCamWatchBySon = Math.min(Math.min(left.withCam + right.withCam, left.withCam + right.noCamWatchBySon), left.noCamWatchBySon + right.withCam);
        return new stats(withCam,noCamWatchByDad,noCamWatchBySon);
    }

    public class stats {
        int withCam;
        int noCamWatchByDad;
        int noCamWatchBySon;
        stats(int x,int y,int z) {
            withCam = x;
            noCamWatchByDad = y;
            noCamWatchBySon = z;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        method_dynamicP example = new method_dynamicP();
        System.out.println(example.minCameraCover(root));
    }


}
