package priv.xgx.list._07_环形链表I;

import priv.xgx.list.ListNode;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/26 22:40
 **/
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = node2;
        boolean b = new Solution().hasCycle(head);
        System.out.println(b);
    }
}
