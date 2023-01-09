package javacore.algorithm.leetcode.under0051;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 23. Merge k Sorted Lists
 */
public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null) {
			return null;
		}
		if (lists.length == 0) {
			ListNode head = new ListNode(-1);
			return head.next;
		}
		if (lists.length == 1) {
			return lists[0];
		}
		if (lists.length == 2) {
			return mergeTwoListNode(lists[0], lists[1]);
		} else {
			int r = lists.length - 1;
			int m = r / 2;
			int n1 = m + 1;
			int n2 = r - m;
			ListNode[] left = new ListNode[n1];
			ListNode[] right = new ListNode[n2];
			System.arraycopy(lists, 0, left, 0, n1);
			System.arraycopy(lists, m + 1, right, 0, n2);
			ListNode mergeLeft = mergeKLists(left);
			ListNode mergeRight = mergeKLists(right);

			return mergeTwoListNode(mergeLeft, mergeRight);
		}
	}

	public ListNode mergeTwoListNode(ListNode left, ListNode right) {
		ListNode head = new ListNode(0);
		ListNode mergeListNode = head;
		if (left == null)
			return right;
		if (right == null)
			return left;
		while (left != null || right != null) {
			if (left == null) {
				mergeListNode.next = right;
				right = null;
			} else if (right == null) {
				mergeListNode.next = left;
				left = null;
			} else {
				if (left.val <= right.val) {
					mergeListNode.next = new ListNode(left.val);
					left = left.next;
				} else {
					mergeListNode.next = new ListNode(right.val);
					right = right.next;
				}
				mergeListNode = mergeListNode.next;
			}
		}

		return head.next;
	}

}
