package priv.xgx.list._203_移除链表元素;

import priv.xgx.list.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dumy = new ListNode(-1);
        ListNode p = head;
        ListNode q = dumy;
        while (p != null) {
            if (p.val != val) {
                q.next = p;
                q = p;
                p = p.next;
            } else {
                p = p.next;
            }
        }
        q.next = null;
        return dumy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        ListNode node2 = new ListNode(6);
        node.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode node6 = new ListNode(6);
        node5.next = node6;
        ListNode listNode = new Solution().removeElements(head, 6);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}