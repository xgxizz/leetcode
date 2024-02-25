package priv.xgx.list._01_删除排序链表中的重复元素;

import priv.xgx.list.ListNode;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 22:33
 **/
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode node1 = new ListNode();
        node1.val = 1;
        head.next = node1;
        ListNode node2 = new ListNode();
        node2.val = 2;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.val = 3;
        node2.next = node3;
        ListNode node4 = new ListNode();
        node4.val = 3;
        node3.next = node4;
        ListNode listNode = new Solution().deleteDuplicates(head);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
