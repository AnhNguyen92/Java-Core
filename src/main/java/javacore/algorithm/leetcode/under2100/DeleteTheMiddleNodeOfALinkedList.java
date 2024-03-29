package javacore.algorithm.leetcode.under2100;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2095. Delete the Middle Node of a Linked List
 */
public class DeleteTheMiddleNodeOfALinkedList {
	public ListNode deleteMiddle(ListNode head) {
		if (head.next == null) {
			return null;
		}
		int len = count(head);
		int mid = len / 2;
		int count = 0;
		ListNode temp = head;
		while (count < mid - 1) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		return head;
	}

	public int count(ListNode head) {
		return (head != null ? (1 + count(head.next)) : 0);
	}
}
