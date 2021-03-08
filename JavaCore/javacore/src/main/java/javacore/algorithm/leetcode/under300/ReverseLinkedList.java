package javacore.algorithm.leetcode.under300;

import javacore.algorithm.leetcode.model.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val, reverse);
            head = head.next;
            reverse = temp;
        }
        return reverse;
    }
}
