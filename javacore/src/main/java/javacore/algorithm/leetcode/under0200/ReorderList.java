package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 143
 */
public class ReorderList {
	public void reorderList(ListNode head) {
		List<Integer> lst = new ArrayList<>();
		addList(lst, head.next);
		reorder(lst, head.next, 0, lst.size() - 1, -1);
	}

	private void reorder(List<Integer> lst, ListNode head, int start, int end, int dir) {
		if (head != null) {
			if (dir == -1) {
				head.val = lst.get(end--);
			} else {
				head.val = lst.get(start++);
			}
			reorder(lst, head.next, start, end, dir * -1);
		}
	}

	private void addList(List<Integer> lst, ListNode head) {
		if (head != null) {
			lst.add(head.val);
			addList(lst, head.next);
		}
	}
}
