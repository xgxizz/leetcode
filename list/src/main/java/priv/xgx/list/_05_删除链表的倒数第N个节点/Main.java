package priv.xgx.list._05_删除链表的倒数第N个节点;

import priv.xgx.list.ListNode;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/26 00:46
 **/
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode listNode = new Solution().removeNthFromEnd(head, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
