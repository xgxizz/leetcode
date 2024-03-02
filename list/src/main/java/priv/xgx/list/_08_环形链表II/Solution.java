package priv.xgx.list._08_环形链表II;

import priv.xgx.list.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        //     return slow;
        // if (hasCycle) {
        //     slow = head;
        //     while (slow != fast) {
        //         slow = slow.next;
        //         fast = fast.next;
        //     }
        //     return slow;
        // }
        // return null;
    }
}