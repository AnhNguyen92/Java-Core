package javacore.algorithm.leetcode.under2200;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2181. Merge Nodes in Between Zeros
 */
public class MergeNodesInBetweenZeros {
	public ListNode mergeNodes(ListNode head) {
		check(head.next);
		return head.next;
	}

	private void check(ListNode head) {
		if (head != null && head.next != null) {
			if (head.next.val == 0) {
				head.next = head.next.next;
				check(head.next);
			} else {
				while (head.next.val > 0) {
					head.val += head.next.val;
					head.next = head.next.next;
				}
				if (head.next != null) {
					head.next = head.next.next;
				}
				check(head.next);
			}
		}
	}
}
