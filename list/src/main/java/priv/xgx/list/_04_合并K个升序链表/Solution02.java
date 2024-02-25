package priv.xgx.list._04_合并K个升序链表;

import priv.xgx.list.ListNode;

/**
 * @Description: TODO
 * @Author: xu.gx
 * @Date: 2024/2/26 00:27
 **/
public class Solution02 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = null;
        for (ListNode node : lists) {
            dummy = mergeTwoLists(dummy, node);
        }
        return dummy;
    }
}
