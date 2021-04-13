package populating_next_right_pointers_in_each_node;

import java.util.LinkedList;

public class method_bfs {

    class Node {

        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        LinkedList<Node> Q = new LinkedList<Node>();
        Q.addLast(root);
        while (!Q.isEmpty()) {
            int tmpNum = Q.size();
            for (int i=0;i<tmpNum - 1;i++) {
                Node tmp = Q.poll();
                tmp.next = Q.getFirst();
                if (tmp.left != null) {
                    Q.addLast(tmp.left);
                }
                if (tmp.right != null) {
                    Q.addLast(tmp.right);
                }
            }
            Node tmp = Q.poll();
            tmp.next = null;
            if (tmp.left != null) {
                Q.addLast(tmp.left);
            }
            if (tmp.right != null) {
                Q.addLast(tmp.right);
            }
        }
        return root;
    }
}
