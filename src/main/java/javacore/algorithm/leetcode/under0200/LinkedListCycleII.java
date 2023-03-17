package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 142. Linked List Cycle II
 */
public class LinkedListCycleII {
	ListNode ans = null;

	public ListNode detectCycle(ListNode head) {
		List<ListNode> lst = new ArrayList<>();
		travel(lst, head);
		return ans;
	}

	private void travel(List<ListNode> lst, ListNode head) {
		if (head != null) {
			if (lst.contains(head)) {
				ans = head;
				return;
			}
			lst.add(head);
			travel(lst, head.next);
		}
	}
}
