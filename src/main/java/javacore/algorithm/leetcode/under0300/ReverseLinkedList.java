package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 206. Reverse Linked List
 */
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
