package javacore.algorithm.leetcode.under0051;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 19
 */

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (n > length(head)) {
			return head;
		}
		if (head == null) {
			return null;
		}
		int size = length(head);
		if (n == size) {
			return head.next;
		}
		
		ListNode temp = head;
		for (int i = 1; i < size - n; i++) {
			temp = temp.next;
		}		
		ListNode removeItem = temp.next;
		ListNode newNextItem = removeItem.next;
		temp.next = newNextItem;
		
		return head;
	}
	
	public int length(ListNode head) {
		ListNode temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter++;
		}
		
		return counter;
	}
	
}
