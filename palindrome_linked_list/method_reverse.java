package palindrome_linked_list;

import listNode.ListNode;

public class method_reverse {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        ListNode rHead = new ListNode(0);
        rHead.next = fast;
        while (fast.next != null) {
            ListNode tmp = fast.next;
            fast.next = tmp.next;
            tmp.next = rHead.next;
            rHead.next = tmp;
        }
        fast = rHead.next;
        slow = dummyHead.next;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
