package priv.xgx.list._02_合并两个有序链表;

import priv.xgx.list.ListNode;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/25 18:44
 **/
public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode listNode = new Solution().mergeTwoLists(list1, list2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
