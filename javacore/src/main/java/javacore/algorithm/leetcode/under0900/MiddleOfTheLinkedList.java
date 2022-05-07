package javacore.algorithm.leetcode.under0900;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 876
 */
public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode temp = new ListNode(0, head);
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}

		count = count / 2 + 1;

		while (count > 0) {
			count--;
			temp = temp.next;
		}
		return temp;
	}
}
