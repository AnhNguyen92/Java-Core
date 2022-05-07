package javacore.algorithm.leetcode.under0051;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode #19
 */

public class RemoveNthNodeFromEndOfList {
	private static Logger logger = LoggerFactory.getLogger(RemoveNthNodeFromEndOfList.class);

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		int n = 2;
		
		ListNode newHead = removeNthFromEnd(head, n);
		logger.info("{}", length(head));
		logger.info("{}", newHead);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
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
	
	public static int length(ListNode head) {
		ListNode temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter++;
		}
		
		return counter;
	}
	
}
