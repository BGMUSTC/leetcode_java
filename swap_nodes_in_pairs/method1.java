package swap_nodes_in_pairs;

import listNode.ListNode;

public class method1 {

    public ListNode swapPairs(ListNode head) {
        //三个特殊情况
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            ListNode tmp = head.next;
            head.next.next = head;
            head.next = null;
            return tmp;
        }
        //一般情况
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (pre.next != null && pre.next.next != null) {
            pre = swapListNode(pre);
        }
        return dummyHead.next;
    }

    private ListNode swapListNode(ListNode p) {
        ListNode q = p.next;
        ListNode nex = q.next.next;
        p.next = q.next;
        q.next.next = q;
        q.next = nex;
        return q;
    }
}
