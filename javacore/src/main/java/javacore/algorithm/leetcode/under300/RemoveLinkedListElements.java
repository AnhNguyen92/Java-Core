package javacore.algorithm.leetcode.under300;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 203
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(-1);
        result.next = head;
        head = result;
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else if (head.next != null && head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        
        return result.next;
    }
}
