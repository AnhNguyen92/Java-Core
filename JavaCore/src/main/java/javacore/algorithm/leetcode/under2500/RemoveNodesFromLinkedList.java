package javacore.algorithm.leetcode.under2500;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2487. Remove Nodes From Linked List
 */
public class RemoveNodesFromLinkedList {
	public ListNode removeNodes(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next != null) {
			head.next = removeNodes(head.next);
			if (head.next.val > head.val) {
				head.val = head.next.val;
				head.next = head.next.next;
			}
		}
		return head;
	}
}
