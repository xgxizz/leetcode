package priv.xgx.list._04_合并K个升序链表;

import priv.xgx.list.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution01 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 定义优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, Comparator.comparingInt(a -> a.val));
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}