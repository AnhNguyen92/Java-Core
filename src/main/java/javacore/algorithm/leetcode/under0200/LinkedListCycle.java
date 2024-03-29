package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 141. Linked List Cycle
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
