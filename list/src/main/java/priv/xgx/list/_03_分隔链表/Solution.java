package priv.xgx.list._03_分隔链表;

import priv.xgx.list.ListNode;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode dummy = new ListNode(-1);
        ListNode p1 = dummy;
        ListNode dummy2 = new ListNode(-1);
        ListNode p2 = dummy2;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
            // p = p.next;
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        p1.next = dummy2.next;
        p2.next = null;
        return dummy.next;
    }
}