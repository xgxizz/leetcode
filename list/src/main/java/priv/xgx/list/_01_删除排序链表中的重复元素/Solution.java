package priv.xgx.list._01_删除排序链表中的重复元素;

import priv.xgx.list.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = fast;
            }
            fast = fast.next;
        }
        if (slow != null) {
            slow.next = null;
        }

        return head;
    }
}