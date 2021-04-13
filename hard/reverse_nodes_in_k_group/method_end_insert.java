package hard.reverse_nodes_in_k_group;

import listNode.ListNode;

// 25
// https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
public class method_end_insert {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode end = dummyHead;
        for (int i=0;i<k;i++) {
            end = end.next;
            if (end == null) {
                return head;
            }
        }
        ListNode pre = dummyHead;
        while (end != null) {
            boolean flag = false;
            pre = reverse(pre,end);
            end = pre;
            for (int i=0;i<k;i++) {
                end = end.next;
                if (end == null) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return dummyHead.next;
    }

    private ListNode reverse(ListNode pre, ListNode end) {
        ListNode start = pre.next;
        ListNode endDump = end;
        while (pre.next != end) {
            ListNode tmp = pre.next;
            pre.next = tmp.next;
            tmp.next = endDump.next;
            endDump.next = tmp;
        }
        return start;
    }
}
